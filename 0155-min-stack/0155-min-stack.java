class MinStack {
    Stack<Integer> stos;
    Stack<Integer> minStos;
    public MinStack() {
        stos = new Stack<>();
        minStos = new Stack<>();
    }
    
    public void push(int val) {
        if(this.minStos.empty()){
            this.minStos.push(val);
            this.stos.push(val);
        }
        else if(this.minStos.peek() >= val){
            this.minStos.push(val);
            this.stos.push(val);
        }
        else{
            this.stos.push(val);
        }
    }
    
    public void pop() {
        if(this.stos.empty()){
        }
        else if(this.stos.peek().equals(this.minStos.peek())){
            this.minStos.pop();
            this.stos.pop();
        }
        else{
            this.stos.pop();
        }
    }
    
    public int top() {
        if(this.stos.empty()){
            return 0;
        }
        else{
            return this.stos.peek();
        }
    }
    
    public int getMin() {
        if(minStos.empty()){
            System.gc();
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
 * int param_4 = obj.getMin();/
 */