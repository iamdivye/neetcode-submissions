class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char alphabet[]= new char[26];
        for(int i=0;i<s.length();i++){
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }
        for(int c : alphabet){
            if(c!=0)
            return false;
        }
        return true;
    }
}
