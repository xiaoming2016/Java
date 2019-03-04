package offer;

import java.util.HashMap;

public class DuplicateArray {
	public static void main(String[] args) {
		
	}
	public static boolean duplicate(int[] numbers,int length,int[] duplicate){
		HashMap<Integer,Integer> hm=new HashMap<>();
		if(numbers==null || numbers.length<2){//没这个通不过
            return false;
        }
		for (int i = 0; i < numbers.length; i++) {
			if(!hm.containsKey(numbers[i])){
				hm.put(numbers[i], 1);
			}else{
				duplicate[0]=numbers[i];
				return true;
			}
		}
		return false;
	}
}
