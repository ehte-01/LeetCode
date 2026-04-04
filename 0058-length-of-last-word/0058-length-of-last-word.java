class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0) continue; // skip spaces
            if (s.charAt(i) == ' ') break; // word finished
            count++; // count letters
        }

        return count;
    }
}