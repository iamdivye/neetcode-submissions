class Solution {
    public String mergeAlternately(String word1, String word2) {
        String w="";
        int x=0,y=0,a=word1.length()-1,b=word2.length()-1;
        while(x<=a || y<=b){
            if(x==a+1){
                while(y<=b){
                    w+=word2.charAt(y);
                    y++;
                }
            }
            if(y==b+1){
                while(x<=a){
                    w+=word1.charAt(x);
                    x++;
                }
            }
            if(x<=a){
                w+=word1.charAt(x);
                x++;
            }
            if(y<=b){
                w+=word2.charAt(y);
                y++;
            }
            
        }
        return w;
    }
}