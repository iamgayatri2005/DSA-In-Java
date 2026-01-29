public class OddAndEvenIndex {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 3, 6, 2 };

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                arr[i] += 10; // even index
            else
                arr[i] *= 2; // odd index
        }

        for (int n : arr)
            System.out.print(n + " ");
    }
}
