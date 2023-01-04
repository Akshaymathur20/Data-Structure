public class Leetcode {
    public static void main(String[] args) {
        int [] nums = {2,2,1};
        System.out.println(singleNumber(nums));
        
    }
    
    // use the below code for leetcode solution just make in public 
     static int singleNumber(int[] num) {
          
         int n= 0;
        for(int i :num){
            n = n^i;
        }
        return n;
     }

}
