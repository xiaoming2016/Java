package offer;

import java.util.Stack;

public class Stack2Queue {
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	
	public static void main(String[] args) {

	}
	public void push(int node){
		s1.push(node);
		
	}
	public int pop(){
		if (s1.isEmpty() && s2.isEmpty()) {
			throw new RuntimeException("error");
		}else if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	public int peek(){
		if (s2.isEmpty()&& s1.isEmpty()) {
			throw new RuntimeException();
		}else if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.peek();
	}

}
