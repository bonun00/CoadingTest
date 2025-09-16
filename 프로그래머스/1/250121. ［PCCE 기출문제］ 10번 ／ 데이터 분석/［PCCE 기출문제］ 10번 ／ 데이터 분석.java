import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer =new int[data.length][4]; 
        if(ext.equals("code")){
            answer =size(data,0,val_ext);
        }
        if(ext.equals("date")){
            answer =size(data,1,val_ext);
        }
        if(ext.equals("maximum")){
            answer =size(data,2,val_ext);
        }
        if(ext.equals("remain")){
            answer = size(data,3,val_ext);
        }
        if(sort_by.equals("code")){
            answer =sort(answer,0);
        }   
        if (sort_by.equals("date")){
            answer =sort(answer,1);
        }
        if(sort_by.equals("maximum")){
            answer =sort(answer,2);
        }
        if(sort_by.equals("remain")){
            answer =sort(answer,3);
        }
        
//         int index=0;
//         for(int i=0; i<answer.length;i++){
//             if(answer[i][0]==0){
//                 remove(answer[i]);
//             }
//         }
        
        
        return answer;
    }
    // public int[][] size(int[][] nums,int w, int max){
    //     int[][] result =new int[nums.length][4]; 
    //     int index =0;
    //     for(int i=0; i < nums.length; i++){
    //         if (nums[i][w]<max){
    //             result[index]=nums[i];
    //             index++;
    //         }
    //     }
    //     return result;
    // }
    
     public int[][] size(int[][] nums, int w, int max) {
        int count = 0;
        for (int[] row : nums) if (row[w] < max) count++;

        int[][] result = new int[count][4];
        int idx = 0;
        for (int[] row : nums) {
            if (row[w] < max) result[idx++] = row;
        }
        return result;
    }

    
      public int[][] sort(int[][] nums, int w) {
        int[][] result = Arrays.copyOf(nums, nums.length);
        Arrays.sort(result, Comparator.comparingInt(a -> a[w]));
        return result;
    }
    
    
    // public int[][] sort(int[][] nums, int w){
    //     int [] temp=new int[nums.length];
    //     for(int i =0; i<nums.length; i++){
    //         temp[i]=nums[i][w];
    //     }
    //     Arrays.sort(temp);
    //     int[][] result =new int[nums.length][4];
    //     for(int i=0; i<temp.length; i++){
    //         for(int u=0; u<temp.length; u++){
    //            if(nums[u][w]==temp[i]){
    //                result[i]=nums[u];
    //            }
    //         }
    //     }
    //     return result;
    // }
    
    
}