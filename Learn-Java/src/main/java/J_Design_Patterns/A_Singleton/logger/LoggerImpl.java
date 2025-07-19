package J_Design_Patterns.A_Singleton.logger;

import org.springframework.boot.logging.LogLevel;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerImpl implements Logger {
    private static volatile LoggerImpl loggerImpl; // Singleton instance. volatile ensures visibility across threads.
    private PrintWriter writer;
    private String logFilePath;

    public static void main(String[] args) {
        Logger logger = LoggerImpl.getInstance();
        logger.setLogFile("application.log");
        logger.log(LogLevel.INFO, "This is an info message.");
        logger.log(LogLevel.ERROR, "This is an error message.");
        logger.flush();
        logger.close();
    }

    private LoggerImpl() {
    }

    public static LoggerImpl getInstance() {
        if (loggerImpl == null) {
            synchronized (LoggerImpl.class) {
                if (loggerImpl == null) {
                    loggerImpl = new LoggerImpl();
                }
            }
        }
        return loggerImpl;
    }

    public static void resetInstance() {
        loggerImpl = null;
    }

    @Override
    public void log(LogLevel level, String message) {
        if (writer != null) {
            String timestamp = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.printf("[%s] [%s] %s%n", timestamp, level.name(), message);
        } else {
            throw new IllegalStateException();
            //System.err.println("Logger is not initialized. Call setLogFile() first.");
        }
    }

    @Override
    public void setLogFile(String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true); // append = true
            writer = new PrintWriter(fileWriter, true); // autoFlush = true
            this.logFilePath = filePath;
        } catch (IOException ex) {
            System.err.println("Failed to set log file: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Override
    public String getLogFile() {
        return this.logFilePath;
    }

    @Override
    public void flush() {
        if (writer != null) {
            writer.flush();
        }
    }

    @Override
    public void close() {
        if (writer != null) {
            writer.close();
            writer = null;
        }
    }
}
