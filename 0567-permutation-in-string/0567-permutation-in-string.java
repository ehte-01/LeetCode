class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] S1Window = new int[26];
        int[] Window = new int[26];

        for(int i=0; i<s1.length();i++){
            S1Window[s1.charAt(i) -'a']++;
        }

        int matches=0;
        for(int i=0;i<26;i++){
            if(Window[i]==S1Window[i]){
                matches++;
            }
        }

        int left=0;
        for(int right=0;right<s2.length();right++){
            int c = s2.charAt(right) -'a';

            if(Window[c]==S1Window[c])
            matches--;
            Window[c]++;
            if(Window[c]==S1Window[c])
            matches++;
        

        if(right-left+1>s1.length()){
            int d=s2.charAt(left) - 'a';
            if(Window[d]==S1Window[d]) matches--;
            Window[d]--;
            if(Window[d]==S1Window[d]) matches++;
            left++;
        }
        if(matches==26) return true;
        }
        return false;
    }
}
