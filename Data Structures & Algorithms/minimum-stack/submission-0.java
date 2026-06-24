class MinStack {
    ArrayList<Integer> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        int size = stack.size();
        stack.remove(size-1);
    }
    
    public int top() {
        int size = stack.size();
        return stack.get(size-1);
    }
    
    public int getMin() {
        int min = top();
        for(int n : stack) {
            if(n < min) {
                min = n;
            }
        }
        return min;
    }
}
