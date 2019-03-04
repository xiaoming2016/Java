package offer;

public class MirrorTreeNode {
	
	/**
	 * 左右节点交换位置  左右子节点递归
	 * @param root
	 */
	public void mirror(TreeNode root){
		if(root==null){
			return;
		}
		if(root.left==null&&root.right==null){
			return;
		}
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		//交换完递归 二叉树 递归
		if(root.left!=null){
			mirror(root.left);
		}
		if(root.right!=null){
			mirror(root.right);
		}
	}

}
