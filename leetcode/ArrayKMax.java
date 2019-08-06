public class ArrayKMax {
		/**
		 * 思路：使用冒泡排序，从大到小，排序好后返回num[k-1];
		 * @param nums
		 * @param k
		 * @return
		 */
	    public int findKthLargest(int[] nums, int k) {
	        
				if(nums.length<1){
					throw new Error();
				}
				if(nums.length<k){
					throw new Error();
				}
	        for (int i = nums.length-1; i >0 ; i--) {
					for (int j = 0; j < i; j++) {
						if(nums[j]<nums[j+1]){
						
						int temp=nums[j];
						nums[j]=nums[j+1];
						nums[j+1]=temp;
						}
					}
				}
	        return nums[k-1];
	        
	        
	    }
	
}
