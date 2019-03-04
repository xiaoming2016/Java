package offer;

import java.util.Stack;



public class GetMinStack {
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> min=new Stack<>();
//	public GetMinStack(){
//		
//	}
	public static void main(String[] args) {
		int[] arr={3,2,5,9,11};
		GetMin st=new GetMin();
		
		for (int i = 0; i < arr.length; i++) {
			st.push(arr[i]);
		}
		System.out.println("min:"+st.getMin());
		
	}
	
	public void push(int node){
//		if (node) {
//			throw new RuntimeErrorException("error");
//		}
		if(min.isEmpty()){
			min.push(node);
		}else if(node<s1.peek()){
			min.push(node);
		}else{
			int num=min.peek();
			min.push(num);
		}
		s1.push(node);
		
	}
	public int pop(){
		if (min.isEmpty()) {
			throw new RuntimeException("pop error");
		}
		min.pop();
		return s1.pop();
	}
	public int getMin(){
		if (min.isEmpty()) {
			throw new RuntimeException("getmin error");
		}
		return min.peek();
		
	}

}
class GetMin{
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> min=new Stack<>();
//	public GetMinStack(){
//		
//	}
	
	
	public void push(int node){
//		if (node) {
//			throw new RuntimeErrorException("error");
//		}
		if(min.isEmpty()){
			min.push(node);
		}else if(node<s1.peek()){
			min.push(node);
		}else{
			int num=min.peek();
			min.push(num);
		}
		s1.push(node);
		
	}
	public int pop(){
		if (min.isEmpty()) {
			throw new RuntimeException("pop error");
		}
		min.pop();
		return s1.pop();
	}
	public int getMin(){
		if (min.isEmpty()) {
			throw new RuntimeException("getmin error");
		}
		return min.peek();
		
	}
}
