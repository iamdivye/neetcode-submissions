class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        String mS = "";

        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || strs[0].charAt(j) != strs[i].charAt(j)) {
                    return mS;
                }
            }
            mS += strs[0].charAt(j);
        }

        return mS;
    }
}