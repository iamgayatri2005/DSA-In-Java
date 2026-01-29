public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {
        // char[] arr = new char[8];
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]+" ");
        // }
        int x[] = {5,8,20,46};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] x) {
        x[2] = 60;
    }
}
