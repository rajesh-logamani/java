package F_multithreading.bigFactorial;
import java.math.BigInteger;

public class BigFactorial extends Thread {
    private final int number;
    private BigInteger factorial;

    public BigFactorial(int number) {
        this.number = number;
    }

    private BigInteger calculateFactorial(BigInteger number){
        if(number.equals(BigInteger.ZERO)) return BigInteger.ONE;
        if (number.equals(BigInteger.ONE)) return number;

        return number.multiply(calculateFactorial(number.subtract(BigInteger.ONE)));
    }

    @Override
    public void run() {
        this.factorial = calculateFactorial(BigInteger.valueOf(this.number));
    }

    public BigInteger getFactorial() {
        return factorial;
    }



    public static void main(String[] args) throws InterruptedException {
        BigFactorial calculator = new BigFactorial(100);
        calculator.start();
        calculator.join(); // Wait for the thread to finish

        System.out.println("Factorial of 100: " + calculator.getFactorial());
    }
}
