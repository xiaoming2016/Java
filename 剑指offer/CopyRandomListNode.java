package offer;

import java.util.HashMap;

public class CopyRandomListNode {

	public ListNode copy(ListNode pHead){
		 HashMap<ListNode,ListNode> arr=new HashMap<>();
	       ListNode cur=pHead;//要放在上面
	        while(cur!=null){
	            arr.put(cur,new ListNode(cur.val));
	                cur=cur.next;
	        }
	        cur=pHead;
	        while(cur!=null){
	            arr.get(cur).next=arr.get(cur.next);
	            arr.get(cur).random=arr.get(cur.random);
	            cur=cur.next;//忘了
	        }
	        return arr.get(pHead);
	}
}
