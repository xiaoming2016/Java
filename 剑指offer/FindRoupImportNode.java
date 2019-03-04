package offer;

import java.util.HashSet;

public class FindRoupImportNode {
	public ListNode findRoup(ListNode pHead){
		ListNode slow=pHead.next;
		ListNode fast=pHead.next.next;
		while (slow!=fast) {
			if(slow==null ||fast==null){
				return null;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		fast=pHead;
		while (fast!=slow) {
			fast=fast.next;
			slow=slow.next;
		}
		return fast;
		
	}
	public ListNode find(ListNode pHead){
		if (pHead==null || pHead.next==null || pHead.next.next==null) {
			return null;//少了不通过
		}
		ListNode slow=pHead.next;//开始位置2
		ListNode fast=pHead.next.next;//开始位置3
		while (slow!=fast) {
			if (slow==null || fast==null) {//忘了
				return null;
			}
			slow=slow.next;
			fast=fast.next.next;
			
		}
		fast=pHead;//相遇fast会开头 再循环是否相遇
		while (fast!=slow) {
			fast=fast.next;//快指针变慢指针一次走1
			slow=slow.next;
		}
		return fast;
	}
	public ListNode method(ListNode pHead){
		HashSet<Integer> hs=new HashSet<>();
        while(pHead!=null){
            if(!hs.add(pHead.val)){
                return pHead;
            }
            pHead=pHead.next;
        }
		return null;
	}
}
