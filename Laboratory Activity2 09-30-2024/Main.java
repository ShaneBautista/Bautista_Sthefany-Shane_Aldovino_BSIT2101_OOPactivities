import java.util.Scanner;

public class Main {

    public static double getArrayMean(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();


        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            arr[i] = scanner.nextInt();
        }

        double meanValue = getArrayMean(arr);
        System.out.println("The mean of the entered numbers is: " + meanValue);

        scanner.close();
    }
}
