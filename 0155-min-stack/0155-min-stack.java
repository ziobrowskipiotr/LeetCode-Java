class MinStack {
    Stack<Integer> stos;
    Stack<Integer> minStos;
    public MinStack() {
        stos = new Stack<>();
        minStos = new Stack<>();
    }
    
    public void push(int val) {
        if(minStos.empty()){
            minStos.push(val);
            stos.push(val);
        }
        else if(minStos.peek() >= val){
            minStos.push(val);
            stos.push(val);
        }
        else{
            stos.push(val);
        }
    }
    
    public void pop() {
        if(stos.empty()){
        }
        else if(stos.peek().equals(minStos.peek())){
            minStos.pop();
            stos.pop();
        }
        else{
            stos.pop();
        }
    }
    
    public int top() {
        if(stos.empty()){
            return 0;
        }
        else{
            return stos.peek();
        }
    }
    
    public int getMin() {
        if(minStos.empty()){
            return 0;
        }
        else{
            return minStos.peek();
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */