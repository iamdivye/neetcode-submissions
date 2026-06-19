class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1,a=1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return (pall(s,i+1,j) || pall(s,i,j-1));
            }
            i++;
            j--;
        }
        return true;
    }
    boolean pall(String s,int i,int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}