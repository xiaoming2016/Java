package offer;

public class PrintCommonLinkedList {

	public static void main(String[] args) {
		
	}
	 public ListNode noLoop(ListNode head1,ListNode head2){
		 if(head1==null || head2==null){
             return null;
         }
	        ListNode cur1=head1;
	        ListNode cur2=head2;
	        int length1=0;
	        int length2=0;
	        while(cur1!=null){
	            length1++;
	            cur1=cur1.next;
	        }
	        while(cur2!=null){
	            length2++;
	            cur2=cur2.next;
	        }
	        cur1=length1>length2?head1:head2;
	        cur2=cur1==head1?head2:head1;
	        int distance=Math.abs(length1-length2);
	        while(distance!=0){
	            distance--;
	            cur1=cur1.next;
	        }
	        while(cur1!=cur2){
	            cur1=cur1.next;
	            cur2=cur2.next;
	        }
	        return cur1;
	    }
	 public ListNode printFirst(ListNode pHead1,ListNode pHead2){
		 while(pHead1!=null &&pHead2!=null){
	            if(pHead1.val<pHead2.val){
	                pHead1=pHead1.next;
	            }else if(pHead2.val<pHead1.val){
	                pHead2=pHead2.next;
	            }else if(pHead1.val==pHead2.val){
	                return pHead1;
	            }else{
	                return null;
	            }
	        }
	        return null;
	 }
}
