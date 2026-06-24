class Solution {
    public boolean isValid(String s) {
        String open = "({[";
        String close = ")}]";
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char l = s.charAt(i);
            int index = 0;

            index = close.indexOf(l);
            
            if(open.contains(String.valueOf(l))) {
                stack.push(l);
            } else if(!stack.isEmpty() && stack.peek() == open.charAt(index)) {
                stack.pop();
            } else {
                return false;
            }
        }

        if(!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}
