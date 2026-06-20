class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String sign = new String(letters);

            if(!map.containsKey(sign)) {
                map.put(sign, new ArrayList<>());
            }

            map.get(sign).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
