// class MajorityElement {

//     static int majorityElement(int arr[]) {
//         int n = arr.length;

//         for (int val : arr) {
//             int freq = 0;

//             for (int el : arr) {
//                 if (el == val) {
//                     freq++;
//                 }
//             }

//             if (freq > n / 2) {
//                 return val;
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {

//         int arr[] = {2, 2, 1, 1, 2};

//         int result = majorityElement(arr);

//         System.out.println("Majority Element: " + result);
//     }
// }
