public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 9, 1 };
        int key = 9;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found");
                return;
            }
        }

        System.out.println("Element not found");
    }
}
