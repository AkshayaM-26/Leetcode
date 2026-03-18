class MyQueue {
    Stack<Integer>s;
    Stack<Integer> hs;
    public MyQueue() {
        s=new Stack<>();
        hs=new Stack<>();
    }
    public void push(int x) {
        while(!s.isEmpty()){
            hs.push(s.pop());
        }
        s.push(x);
        while(!hs.isEmpty()){
            s.push(hs.pop());
        }
    }
    public int pop() {
        return s.pop();
    }
    public int peek() {
        return s.peek();
    }
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */