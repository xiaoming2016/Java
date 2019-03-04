package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class GetMaxWindow {
	public static void main(String[] args){
		int[] arr={4,3,5,4,3,3,6,7};
		int[] res=getMaxWindow(arr,3);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
		System.out.println("-------");
		ArrayList<Integer> list=getMaxWindow4(arr,3);
		for (Integer i : list) {
			System.out.print(i);
		}
		
	}
	public static int[] getMaxWindow(int[] arr,int w){
		//public static ArrayList<Integer> getMaxWindow(int[] arr,int w){
		if(arr==null ||w<1 ||arr.length<w){
			return null;
		}
		LinkedList<Integer> qmax=new LinkedList<>();
		//ArrayList<Integer> res=new ArrayList<>();
		int[] res=new int[arr.length-w+1];
		int index=0;
		for(int i=0;i<arr.length;i++){//length-1
			while(!qmax.isEmpty() && arr[qmax.peekLast()]<=arr[i]){
				qmax.pollLast();
			}
			qmax.addLast(i);
			if(qmax.peekFirst()==i-w){
				qmax.pollFirst();
			}
			if(i>=w-1){
				res[index++]=arr[qmax.peekFirst()];
				//res.add(arr[qmax.peekFirst()]);
			}
		}
		return res;
	}
	public static ArrayList<Integer> getMaxWindow2(int[] num,int size){
		
		
		
//		ArrayList<Integer> temp=new ArrayList<>();
//		ArrayList<Integer> res=new ArrayList<>();
//		if (arr.length<w ||w==0) {
//			return res;
//		}
//		
//		for(int i=0;i<arr.length-w+1;i++){//length-w  注意
//			 temp=new ArrayList<>();//每循环一次就清空
//			for (int j = i; j < i+w; j++) {  //时间复杂度m*n
//				temp.add(arr[j]);
//			}
//			Collections.sort(temp);
//			
//			res.add(temp.get(temp.size()-1));
//			
//		}
		ArrayList<Integer> res=new ArrayList<>();
		if(num==null ||size<1 ||num.length<size){
			return res;
		}
		LinkedList<Integer> qmax=new LinkedList<>();
		
		
		for(int i=0;i<num.length;i++){//length-1
			while(!qmax.isEmpty() && num[qmax.peekLast()]<=num[i]){
				qmax.pollLast();
			}
			qmax.addLast(i);
			if(qmax.peekFirst()==i-size){
				qmax.pollFirst();
			}
			if(i>=size-1){
				//res[index++]=arr[qmax.peekFirst()];
				res.add(num[qmax.peekFirst()]);
			}
		}
		return res;
	}
	public static ArrayList<Integer> getMaxWindow3(int[] num,int size){
		ArrayList<Integer> res=new ArrayList<>();
		if (num==null||size<1||num.length<size) {
			return res;
		}
		LinkedList<Integer> list=new LinkedList<>();
		
		for (int i = 0; i < num.length; i++) {
			while (!list.isEmpty()&& num[list.peekLast()]<=num[i]) {//=
				list.pollLast();
			}
			list.addLast(i);
			if (list.peekFirst()==i-size) {//窗口一移出包含队头数的范围
				list.pollFirst();
			}
			if (i>=size-1) {
				System.out.print("i:"+i+" ");
				
				res.add(num[list.peekFirst()]);
			}
		}
		return res;
	}
	public static ArrayList<Integer> getMaxWindow4(int[] num,int size){
		ArrayList<Integer> res=new ArrayList<>();
		if (num==null || num.length<size ||size<1) {
			return res;
		}
		LinkedList<Integer> qmax=new LinkedList<>();
		for (int i = 0; i < num.length; i++) {
			while (!qmax.isEmpty()&& num[qmax.peekLast()]<=num[i]) {
				qmax.pollLast();
			}
			qmax.addLast(i);
			if (qmax.peekFirst()==i-size) {
				qmax.pollFirst();
			}
			
			if (i>=size-1) {
				res.add(num[qmax.peekFirst()]);
			}
		}
		return res;
		
	}
	
}
