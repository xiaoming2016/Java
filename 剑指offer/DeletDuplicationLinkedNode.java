package offer;

import java.util.HashSet;

public class DeletDuplicationLinkedNode {
	 public void deleteDuplication(ListNode pHead)
	    {
//	        if(pHead==null){
//	            return null;
//	        }
	        HashSet<ListNode> hs=new HashSet<>();
	        ListNode cur=pHead;
	        ListNode pNext=pHead.next;
	         hs.add(pHead);
	        //hs.add(pHead.val);
	        //ListNode cur=pHead;
	        while(cur!=null){
	            //if(hs.contains(cur.val)){
	                if(hs.contains(cur)){
	                cur.next=pNext.next;
	                    
	            }else{
	               // hs.add(cur.val);
	                   hs.add(cur);
	                cur=pNext;
	            }
	            pNext=pNext.next;
	        }
	        
	        
	    }
	 public ListNode deleteDuplication(ListNode pHead){
		 if(pHead==null ||pHead.next==null){
			 return pHead;
		 }
		 if(pHead.val==pHead.next.val){
			 if(pHead.next.next==null){
				 return null;
			 }
			 if(pHead.val==pHead.next.next.val){
				 //pHead.next=deleteDuplication(pHead.next);
				 return deleteDuplication(pHead.next);
			 }
			 //return deleteDuplication(pHead.next);
			 return deleteDuplication(pHead.next.next);
			 
		 }
		 pHead.next=deleteDuplication(pHead.next.next);
		 
	 }
	 public ListNode method(ListNode pHead){
		 ListNode first = new ListNode(-1); 
		    first.next = pHead; 
		    ListNode last = first; //要用于操作记录要删除节点的前一个节点 删除了要用last链接起来
		    ListNode cur = pHead; 
		    while(cur!=null&&cur.next!=null){ //cur.next!=null不能少
		      if(cur.val==cur.next.val){ 
		        int val = cur.val; 
		        while(cur!=null&&cur.val==val){ //第一次会进 第二次不一样了
		          cur = cur.next; 
		        last.next = cur; //跳过重复值  last.next也要往下走
		        } 
		      }else{ //不等直接往下走
		        last = cur; 
		        cur = cur.next; 
		      } 
		    } 
		    return first.next; 
	 }
}
