package offer;

public class SymmetricalTreeNode {
	/**
	 * 定义递归函数 如果左右树值是否相等  左树左节点是否等右树右节点 且左树右节点==右树左节点 否则false
	 * @param pRoot
	 * @return
	 */
	boolean isSymmetrical(TreeNode pRoot)
    {
        
        if(pRoot==null){
            return true;
        }
      return mirror(pRoot.left,pRoot.right);
    }
    public boolean mirror(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        
        return left.val==right.val?mirror(left.left,right.right)&&mirror(left.right,right.left):false;
       
    }
}
