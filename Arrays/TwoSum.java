public class TwoSum{
    public static void main(String[] args) {
        
    }
    boolean twoSum(int arr[], int target) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                if(arr[i]+arr[j] == target)
                    return true;
            }
        }
        return false;
    }
}