import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer #" + (i + 1) + " >> ");
            numbers[i] = scanner.nextInt();
        }

        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, 12);
        displayHigherThanAverage(numbers);

        scanner.close();
    }

    public static void display(int[] arr) {
        System.out.print("The numbers are ");
        for (int num : arr) {
            System.out.print(num + "  ");
        }
        System.out.println();
    }

    public static void displayReverse(int[] arr) {
        System.out.print("The numbers in reverse order are ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void displaySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of all numbers is " + sum);
    }

    public static void displayLessThan(int[] arr, int limit) {
        System.out.print("Numbers less than " + limit + " are ");
        boolean found = false;
        for (int num : arr) {
            if (num < limit) {
                System.out.print(num + "  ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    public static void displayHigherThanAverage(int[] arr) {
        double average = calculateAverage(arr);
        System.out.println("The average is " + average);
        System.out.print("Numbers higher than the average are ");
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + "  ");
            }
        }
        System.out.println();
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
