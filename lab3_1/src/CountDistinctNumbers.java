import java.util.HashSet;

public class CountDistinctNumbers {
    public static void main(String[] args) {
        int[] array = {5, 7, 5}; // Example array
        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            set.add(num);
        }

        System.out.println("Number of different numbers in the array: " + set.size());
    }
}
