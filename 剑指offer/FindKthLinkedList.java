package offer;

public class FindKthLinkedList {
	public ListNode find(ListNode head,int k){
		if(head==null||k<1){
            return null;
        }
       int count=0;
        ListNode cur=head;
        while(head!=null){
            head=head.next;
            count++;
        }
        if(k>count){
            return null;
        }
        for(int i=0;i<count-k;i++){
            cur=cur.next;
        }
        return cur;
	}
}
