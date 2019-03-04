package offer;

public class MultiplyArray {
	public static void main(String[] args) {
		int[] array={3,2,4,1};
		int[] res=multiply(array);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}
	public static int[] multiply(int[] A){
		
		        if(A==null || A.length<2){
		            return null;
		        }
		        int[] B=new int[A.length];
		        B[0]=1;
		        for(int i=1;i<A.length;i++){		           
		            
		                 B[i]=B[i-1]*A[i-1];//画图对角1 总结规律
		            
		            
		        }
		        int temp=1;
		        for (int j = A.length-2; j >=0 ; j--) {
					//B[j]=B[j-1]*A[j-1];//从下往上也是连乘
		        	 //temp*=A[j+1];//是加1 不是减1
		        	 temp=temp*A[j+1];
		        	B[j]=B[j]*temp;
				}
		        return B;
		    }
	
}
