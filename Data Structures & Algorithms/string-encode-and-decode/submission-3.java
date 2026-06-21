class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        if(strs == null) {
            return encoded.toString();
        }

        for(String w : strs) {
            encoded.append(w.length()).append('#').append(w);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList();

        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            
            int length = Integer.parseInt(str.substring(i, j));
            
            i = j + 1;
            
            String word = str.substring(i, i + length);
            decoded.add(word);
            
            i += length;
        }
        
        return decoded;
    }
}
