public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 4, 5, 6, 0, 8}; // Example array

        int productOfEvens = 1;
        int sumBetweenZeros = 0;
        boolean foundFirstZero = false;

        for (int num : array) {
            if (num % 2 == 0) {
                productOfEvens *= num;
            }

            if (num == 0) {
                if (!foundFirstZero) {
                    foundFirstZero = true;
                } else {
                    break;
                }
            }

            if (foundFirstZero) {
                sumBetweenZeros += num;
            }
        }

        System.out.println("Product of even elements: " + productOfEvens);
        System.out.println("Sum of elements between first and last zero: " + sumBetweenZeros);
    }
}
