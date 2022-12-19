import java.util.Arrays;

// package DataStructure.Searching.Linear Search;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr ={ 1,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        // linear(arr, 7);
        System.out.println(linear(arr, 7));
        
    }
    static int linear(int[] arr ,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element ==target){
                return i;
            }

            
        }
    return -1;
    }
    
}
