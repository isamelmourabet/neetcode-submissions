class Solution {
    public boolean isValid(String s) {
        String open = "({[";
        String close = ")}]";
        Boolean isOpen = false;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char l = s.charAt(i);
            int index = 0;

            index = open.indexOf(l);
            
            if(open.contains(String.valueOf(l))) {
                stack.push(l);
            } else if(!stack.isEmpty()) {
                index = close.indexOf(l);
                if(stack.peek() == open.charAt(index)) {
                    stack.pop();
                } else {
                    return false;
                }
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
