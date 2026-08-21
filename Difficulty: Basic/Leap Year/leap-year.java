class Solution {
    static boolean checkYear(int N) {
        // code here
        if(N % 100 ==0 && N % 400 == 0) //centruy year
        return true;
        else if(N % 100 !=0 && N % 4 == 0) //Normal year
        return true;
        else
        return false;
        
    }
}