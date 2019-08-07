class MergeKLists {

/*
思路：使用优先级队列
把所有的链表值压入优先级队列，再弹出到新的链表
*/


    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {

            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
            
        });
        for(ListNode e : lists){
            if(e != null){
                pq.add(e);
            }
        }
        ListNode head = new ListNode(0);
        head.next = null;
        ListNode tail = head;
        while(!pq.isEmpty()){
            tail.next = pq.poll();
            tail = tail.next;
            if(tail.next != null){
                pq.add(tail.next);              
            }
            tail.next = null;
        }
        return head.next;
    }
}
