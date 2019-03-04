package offer;

import java.util.ArrayList;
import java.util.Stack;
 
public class RerverseReturnArrayList {
	
	public ArrayList<Integer> reverse(ListNode listNode){
		Stack<Integer> stack=new Stack<>();
		ArrayList<Integer> arr=new ArrayList<>();
		while (listNode.next!=null) {
			stack.push(listNode.val);
		}
		while (!stack.isEmpty()) {
			arr.add(stack.pop());
		}
		return arr;
	}
}
class ListNode{
	int val;
	ListNode next=null;
	public ListNode(int val){
		this.val=val;
	}
}
