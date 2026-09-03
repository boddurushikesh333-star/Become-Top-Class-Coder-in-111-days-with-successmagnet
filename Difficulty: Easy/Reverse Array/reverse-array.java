class Solution {
    public void reverseArray(int a[]) {
        // code here
        int b[] = new int[a.length];
        int i=a.length-1, j=0;
        
        while(j<b.length) {
            b[j] = a[i];
            
            j++;
            i--;
        }
        //update the array elements
        
        for(i = 0; i<b.length; i++) {
            a[i] = b[i];
        }
    }
}