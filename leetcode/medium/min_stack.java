package leetcode.medium;

import java.util.*;

public class min_stack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> st = new Stack<>();
    
    public void push(int val) {
        if(val <= min){
            st.push(min);   // stores previous min
            min=val;
        }
        st.push(val);
    }
    
    public void pop() {
        if(st.pop() == min){    // here pop operation happened 
            min = st.pop();     // here happened again 
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
    public static void main(String[] args) {
        
    }
}
