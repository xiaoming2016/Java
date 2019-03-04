package offer;

public class VerifySquenceOfBST {
	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length<1){
            return false;
        }
        return  isPost(sequence,0,sequence.length-1);
        
    }
    public boolean isPost(int[] arr,int start,int end){
        if(start>=end){
            return true;//为什么 最后相遇结束了
        }
        int i=end;
        while(i>start&& arr[i-1]>arr[end]){
            --i;
        }
        for(int j=i-1;j>=start;j--){
            if(arr[j]>arr[end]){
                return false;
            }
        }
        return isPost(arr,start,i-1)&&isPost(arr,i,end-1);//end-1
    }
}
