class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n= arr.length+1;
        
        if(n==1) return 2;
        
        int check = 1;
        
        for(int i =0; i<=n-2; i++){
            if(check==arr[i])
            check++;
            else
            return check;
        }
        return n;
    }
}