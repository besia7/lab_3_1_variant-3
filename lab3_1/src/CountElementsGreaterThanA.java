import java.util.Scanner;

public class CountElementsGreaterThanA {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter number A: ");
                int A = scanner.nextInt();

                int[] array = {1, 5, 10, 15, 20}; // Example array
                int count = 0;

                for (int element : array) {
                        if (element > A) {
                                count++;
                        }
                }

                System.out.println("Number of elements greater than A: " + count);
        }
}
