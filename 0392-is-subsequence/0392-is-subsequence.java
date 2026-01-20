class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int sPos = 0, tPos = 0;
        int sLength = s.length(), tLength = t.length();
       
        while(sPos < sLength && tPos < tLength){
            if(s.charAt(sPos) == t.charAt(tPos))
                sPos++;
            tPos++;
        }

        return sPos == sLength;   
    }
}