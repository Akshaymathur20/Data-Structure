package DataStructure.Sorting.Cyclicsort.QuestionsLeetocde;

//Missing number in the array. 

import java.util.Arrays;

public class Ques_268 {
    public static void main(String[] args) {
        int [] nums = { 4,0,1,2};
        System.out.println(Arrays.toString(nums));
        Missing(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    static int Missing(int[]nums ){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if((nums[i]<nums.length)&&(nums[i] != nums[correct])){
                swap(nums,i,correct);
            }

        }

        //search for first missing numbers 
        //case 1
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j){
                return j;
            }
            
        }

        //case 2 \
        return nums.length;
    }
    static void swap(int[]nums  , int first, int second){
        int temp = nums[first];
        nums[first] =nums[second];
        nums[second]=temp;
        
    }
    
}
