import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the interval: ");
        int x = in.nextInt();
        int y = in.nextInt();
        Interval interval = new Interval(x, y);

        interval.ShowNumbers();
        interval.ShowSum();

        System.out.print("Enter number of Fibonacci numbers: ");
        int length = in.nextInt();
        Fibonacci fibonacci = new Fibonacci(x, y, length);
        fibonacci.CreateRange();
        fibonacci.ShowNumbers();
    }
}

/**
 * class Interval with lower and upper limits
 * @autor Ihor Kordoba
 * @version 2.1
 */
class Interval {
    private int x;
    private int y;

    /**
     * default constructor
     */
    public Interval() {
        x = 0;
        y = 0;
    }

    /**
     * constructor with params
     * @param x the lower limit of the interval
     * @param y the upper limit of the interval
     */
    public Interval(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return the lower limit of the interval
     */
    public int getX() {
        return x;
    }

    /**
     * sets the lower limit of the interval
     * @param x the lower limit of the interval
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return the upper limit of the interval
     */
    public int getY() {
        return y;
    }

    /**
     * sets the upper limit of the interval
     * @param y the upper limit of the interval
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * prints odd numbers in ascending order and
     * even numbers in descending order
     */
    public void ShowNumbers() {
        int odd = (x & 1) == 1 ? x : x + 1;
        int even = (y & 1) == 1 ? y - 1 : y;

        System.out.print("Odd numbers: ");
        while (odd <= y) {
            System.out.printf("%d ", odd);
            odd += 2;
        }
        System.out.print("\nEven numbers: ");
        while (x <= even) {
            System.out.printf("%d ", even);
            even -= 2;
        }
        System.out.println();
    }

    /**
     *prints the odd numbers sum and
     * even numbers sum
     */
    public void ShowSum() {
        int odd = (x & 1) == 1 ? x : x + 1;
        int even = (y & 1) == 1 ? y - 1 : y;

        int OddSum = 0;
        int EvenSum = 0;

        while (odd <= y) {
            OddSum += odd;
            odd += 2;
        }
        System.out.printf("Odd numbers sum: %d\n", OddSum);

        while (x <= even) {
            EvenSum += even;
            even -= 2;
        }
        System.out.printf("Even numbers sum: %d\n", EvenSum);
    }
}

/**
 * class Interval with lower, upper limits and number of
 * Fibonacci numbers
 *  * @autor Ihor Kordoba
 *  * @version 1.1
 */
class Fibonacci extends Interval
{
    private int numbers[];

    /**
     * default constructor
     */
    public Fibonacci()
    {
        super();
    }

    /**
     * constructor with parameters
     * @param x the lower limit of the interval
     * @param y the upper limit of the interval
     * @param length number of Fibonacci numbers
     */
    public Fibonacci(int x, int y, int length)
    {
        super(x, y);
        numbers = new int[length];
    }

    /**
     * sets number of Fibonacci numbers
     * @param length number of Fibonacci numbers
     */
    public void setLength(int length) {
        this.numbers = new int[length];
    }

    /**
     *
     * @return number of Fibonacci numbers
     */
    public int getLength() {
        return numbers.length;
    }

    /**
     * creating Fibonacci series
     */
    public void CreateRange()
    {
        int y = getY();

        if ((y & 1) == 1) {
            numbers[0] = y;
            numbers[1] = y - 1;
        }
        else {
            numbers[0] = y - 1;
            numbers[1] = y;
        }

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
    }

    /**
     *prints percents of odd and even numbers
     */
    @Override
    public void ShowNumbers()
    {
        int oddCount = countOdd();
        int prc = oddCount * 100 / numbers.length;
        System.out.printf("%d%% odd numbers\n", prc);
        System.out.printf("%d%% even numbers\n", 100 - prc);
    }

    private int countOdd() {
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] & 1) == 1) {
                oddCount++;
            }
        }
        return oddCount;
    }
}