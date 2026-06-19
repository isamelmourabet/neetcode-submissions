class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] abecedario = new int[26];

        for(int i = 0; i < s.length(); i++) {
            abecedario[s.charAt(i) - 'a']++;
            abecedario[t.charAt(i) - 'a']--;
        }

        for(int n: abecedario) {
            if(n != 0) return false;
        }

        return true;
    }
}
