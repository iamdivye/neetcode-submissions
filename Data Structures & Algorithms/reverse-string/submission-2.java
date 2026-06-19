class Solution {
    public void reverseString(char[] s) {
        int l=0,r=s.length-1;
        while(l<r){
            char c=s[l];
            s[l]=s[r];
            s[r]=c;
            l++;
            r--;
        }
        
        // for(int i=0;i<s.length;i++)
        // System.out.println(s[i]);
    }
}