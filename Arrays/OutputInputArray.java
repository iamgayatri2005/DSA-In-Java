import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {3,6,8,9,0,14,16,35,7,25};
        // System.out.println(arr.length);
        // int n = arr.length;//index - 0 to n-1

        // for (int i=0; i<n; i++) {
        //     System.out.println(arr[i]+ " ");
        // }
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // System.out.println(arr[5]);
        // System.out.println(arr[6]);

        int[] yogesh = new int[5];
        for(int i=0;i<5;i++){
            System.out.println(yogesh[i]+ " ");
        }
        //input
        for(int i=0;i<5;i++){
            yogesh[i] =sc.nextInt();
        }
        for(int i=0; i<5;i++){
            System.out.println(2*yogesh[i]+" ");
        }
    }
}
