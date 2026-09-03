class Solution {
    public void reverseArray(int a[]) {
        // code here
       
        int  i=0, j=a.length-1;
        
        while(i<=j) {
            //swapping
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            
            i++;
            j--;
        }
    }
}