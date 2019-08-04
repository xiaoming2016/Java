package leetcode50;

import java.util.Stack;
/**
 * 
 * @author xiaofei
 *	思路：
 *	构造一个数据栈stack和一个辅助栈：minStack
 *	push:当minStack为空时，直接压入值;当x大于minStack 栈顶元素时，minStack压入自我栈顶的元素
 *	当x小于minStack栈顶元素时，minStack直接压入x;stack栈一定要压x
 *	pop:minStack和stack 都要弹出栈顶元素 
 *(辅助栈的栈顶元素等于数据栈的栈顶元素才出栈--前面压入时同步可以不用判断是否相等)
 *	top:判空返回stack栈顶元素
 *	getMin：判空返回minStack栈顶元素
 */
public class MinStack {
	
        Stack<Integer> stack;
        Stack<Integer> minStack;
   /** initialize your data structure here. */
   public MinStack() {
       this.stack=new Stack<>();
       this.minStack=new Stack<>();;
       
   }
   
   public void push(int x) {
      
       if(minStack.isEmpty()){  
           minStack.push(x);
       }else if(minStack.peek()<x){
       minStack.push(this.minStack.peek());
           
       }else{
           minStack.push(x);
       }
       stack.push(x);
   }
   
   public void pop() {
       if(stack.isEmpty()){
           throw new RuntimeException();
       }
       int data=stack.pop();
       if(data==minStack.peek()){
    	   minStack.pop();
       }
       
       
   }
   
   public int top() {
       if(stack.peek()==null){
           throw new Error();
       }
       return stack.peek();
   }
   
   public int getMin() {
       if(minStack.peek()==null){
           throw new Error();
       }
       return this.minStack.peek();
   }

}
