package offer;

public class ReverseList {

	public static void main(String[] args) {
		
	}
	public ListNode reverse(ListNode head){
		ListNode dummay=new ListNode(-1);
		ListNode pCur=head;
		while (pCur!=null) {
			ListNode pNext=pCur.next;
			pCur.next=dummay.next;
			dummay.next=pCur;
			pCur=pNext;
		}
		return dummay.next;
//		ListNode pre=null;
//        ListNode next=null;
//        while(head!=null){
//            next=head.next;//保存head.next内容
//            head.next=pre;
//            pre=head;
//            head=next;
//        }
//        return pre;
	}
	public ListNode reverse2(ListNode node){
		ListNode newList=new ListNode(-1);
		ListNode pCur=node;
		while (pCur!=null) {
			ListNode pNext=pCur.next;
			pCur.next=newList.next;
			newList.next=pCur;
			pCur=pNext;
		}
		return newList.next;
	}

}
class ListNode{
	int val;
	ListNode next=null;
	ListNode(int val){
		this.val=val;
	}
}
