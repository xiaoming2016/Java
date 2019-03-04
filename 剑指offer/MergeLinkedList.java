package offer;

import java.util.LinkedList;

public class MergeLinkedList {
	public ListNode merge(ListNode list1,ListNode list2){
		if(list1==null && list2==null){
			return null;
		}
		if(list1==null){
			return list2;//注意是list2
		}
		if(list2==null){
			return list1;//注意是list1
		}
		ListNode list=null;
		if(list1.val<list2.val){
			list=list1;
			list.next=merge(list1.next,list2);
		}else{
			list=list2;
			list.next=merge(list1,list2.next);
		}
		return list;
	}
}
