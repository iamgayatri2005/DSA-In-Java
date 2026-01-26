//print sum of elements of the array
// public class PrintSum {
//     public static void main(String[] args) {
//         int[] arr = {-6,4,12,-9,23};
//         int sum = 0;
//         for(int i=0; i<arr.length; i++){
//             sum += arr[i];
//         }
//         System.out.println(sum);
//     }
// }

//print the maximum element in the array
// public class PrintSum{
//     public static void main(String[] args) {
//         int[] arr = {10,3,15,45,78,34,90};
//         int max = arr[0];

//         for(int i=1; i<arr.length; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         System.out.println("maximum element is:" + max);
//     }
// }

//print the minimum element in the array
public class PrintSum{
    public static void main(String[] args) {
        int [] arr = {12,34,56,14,4,6,8,4,34};
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr [i] < min) {
                min = arr[i];
            }
        }
        System.out.println("minimum element is:" + min);
    }
}