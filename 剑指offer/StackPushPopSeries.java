package offer;

import java.util.Stack;

public class StackPushPopSeries {
	/**
	 * 1-2-3-4-5 判断弹出序列是否 4-5-3-2-1
	 * @param args
	 */
	public static void main(String[] args) {

	}
	public boolean IsPopOrder(int [] pushA,int [] popA) {
		if (pushA==null || popA==null) {
			return false;
		}
		Stack<Integer> s=new Stack<>();
		int j=0;
		for (int i = 0; i < pushA.length; i++) {
			s.push(pushA[i]);
			//if (!s.isEmpty()&&pushA[i]==popA[j]) {
			while(!s.isEmpty() && popA[j]==s.peek()){//不是if 是while 如果5压入弹出后不while 前面的数不会弹出
				s.pop();
				j++;
			}
			
		}
		return s.isEmpty();//不能忘了 如果能全部弹出就一样
	}

}
