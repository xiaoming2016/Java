package offer;

import java.util.Arrays;

public class minNumberInRotateArray {

	public static void main(String[] args) {
		int[] array={3,4,1,2};
		System.out.println(minNumberInRotate(array));
	}
	 public static int minNumberInRotate(int[] array) {
	        if(array==null){
	            return 0;
	        }
	        
	       
	     for(int i=0;i<array.length-1;i++){//length-1 不是length
	        if (array[i]>array[i+1]) {//非递减已排好序 前数不会大后数
				return array[i+1];
			}
	     }
	        return array[0];
	    }

}
