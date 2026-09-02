class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max= Integer.MIN_VALUE;
        
        for(int i = 0; i<arr.length; i++) {
            
            if(arr[i] > max ) {
                
                max = arr[i];
            }
        }
        // max 35
        int secondmax = Integer.MIN_VALUE;
         
         for(int i = 0 ; i<arr.length; i++) 
         {
             if (arr[i] > secondmax && arr[i] < max) {
                 
                 secondmax = arr[i];
             }
         }
         if(secondmax==Integer.MIN_VALUE) return -1;
         
         else return secondmax;
    }
}