package offer;

public class BalanceTree {
	/**
	 * 平衡二叉树 获取树的深度 左右子树深度
	 * @param root
	 * @return
	 */
	public boolean IsBalanced_Solution(TreeNode root) {
		boolean[] res=new boolean[1];
		res[0]=true;
		
		getHeight(root,1,res);
		return res[0];
		
	}
	public int getHeight(TreeNode root,int level,boolean[] res){
		if(root==null){
			return level;//
		}
		int Lh=getHeight(root.left,level+1,res);
		if(!res[0]){
			return level;
		}
		int Rh=getHeight(root.right,level+1,res);
		if(!res[0]){
			return level;
		}
		if(Math.abs(Lh-Rh)>1){
			res[0]=false;
		}
		return Math.max(Lh, Rh);
		
	}
	
	public  boolean old(TreeNode root){
		public static class ReturnData{
	        public boolean isB;
	        public int h;
	        public ReturnData(boolean isB,int h){
	            this.isB=isB;
	            this.h=h;
	        }
	    }
	    public static ReturnData process(TreeNode head){
	        if(head==null){
	            return  new ReturnData(true,1);
	        }
	        ReturnData left=process(head.left);
	        if(!left.isB){
	            return new ReturnData(false,0);
	        }
	        ReturnData right=process(head.right);
	        if(!right.isB){
	            return new ReturnData(false,0);
	        }
	        if(Math.abs(right.h-left.h)>1){
	            return new ReturnData(false,0);
	        }
	        return new ReturnData(true,Math.max(left.h,right.h)+1);
	    }
	}
}
