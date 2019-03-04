package offer;

public class TreeDeep {
	 public int TreeDepth(TreeNode root) {
	        int deep=0;
	        
	         if(root==null){
	            return deep;
	        }
	        int left=TreeDepth(root.left)+1;
	        int right=TreeDepth(root.right)+1;
	        return Math.max(left,right);
	        
	    }
}
