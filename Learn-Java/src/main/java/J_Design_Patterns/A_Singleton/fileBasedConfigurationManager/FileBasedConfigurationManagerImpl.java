package J_Design_Patterns.A_Singleton.fileBasedConfigurationManager;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    public static void main(String[] args) {
        // Example usage
        FileBasedConfigurationManager configManager = FileBasedConfigurationManagerImpl.getInstance();
        System.out.println("Current working dir: " + System.getProperty("user.dir"));
        configManager.load(System.getProperty("user.dir") + "/src/main/resources/config.properties");

        // Set a configuration
        configManager.setConfiguration("app.name", "MyApp");
        configManager.setConfiguration("app.port", "9000");

        // Get a configuration
        String appName = configManager.getConfiguration("app.name");
        System.out.println("App Name: " + appName);

        // Get a configuration with type
        Integer port = configManager.getConfiguration("app.port", Integer.class);
        System.out.println("App Port: " + port);

        // Remove a configuration
        configManager.removeConfiguration("app.name");

        // Clear all configurations
        configManager.clear();
    }


    private static FileBasedConfigurationManagerImpl fileBasedConfigurationManagerImpl;

    private FileBasedConfigurationManagerImpl() {

    }

    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        return this.properties.getProperty(key);
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getConfiguration'");
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        String value = this.properties.getProperty(key);
        if (value == null) {
            return null;
        }

        Object convertedValue;

        if (type == String.class) {
            convertedValue = value;
        } else if (type == Integer.class) {
            convertedValue = Integer.valueOf(value);
        } else if (type == Boolean.class) {
            convertedValue = Boolean.valueOf(value);
        } else if (type == Double.class) {
            convertedValue = Double.valueOf(value);
        } else if (type == Long.class) {
            convertedValue = Long.valueOf(value);
        } else if (type == Float.class) {
            convertedValue = Float.valueOf(value);
        } else {
            throw new IllegalArgumentException("Unsupported type: " + type);
        }

        return type.cast(convertedValue);
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getConfiguration'");
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        this.properties.setProperty(key, value);
        // throw new UnsupportedOperationException("Unimplemented method
        // 'setConfiguration'");
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        this.properties.setProperty(key, (String) value);
        // throw new UnsupportedOperationException("Unimplemented method
        // 'setConfiguration'");
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        this.properties.remove(key);
        // throw new UnsupportedOperationException("Unimplemented method
        // 'removeConfiguration'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        this.properties.clear();
        // throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    public static FileBasedConfigurationManager getInstance() {
        // TODO Auto-generated method stub
        if (fileBasedConfigurationManagerImpl == null) {
            synchronized (FileBasedConfigurationManagerImpl.class) {
                if (fileBasedConfigurationManagerImpl == null) {
                    fileBasedConfigurationManagerImpl = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return fileBasedConfigurationManagerImpl;
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
        fileBasedConfigurationManagerImpl = null;
    }

}
