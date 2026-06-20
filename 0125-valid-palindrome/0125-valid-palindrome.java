class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String dummy="";
        String newS="";
        for(int i=0;i<s.length();i++){
            if(String.valueOf(s.charAt(i)).matches("[a-z0-9+]")){
                dummy=dummy+s.charAt(i);
            }
        }
        for(int i=dummy.length()-1;i>=0;i--){
            newS=newS+dummy.charAt(i);
        }
        if(dummy.equals(newS)){
            return true;
        }
        return false;

    }
}