package offer;

public class HasSubtree {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root1==null||root2==null){
			return false;
		}
		return check(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
		//后半部分记错了
		
	}
	public boolean check(TreeNode root1,TreeNode root2){
		if(root2==null){
			return true;
		}
		if(root1==null||root1.val!=root2.val){
			return false;
		}
		if(root1.val==root2.val){
			return check(root1.left,root2)&&check(root1.right,root2);
		}else{
			return false;
		}
	}
}
