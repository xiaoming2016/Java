package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeNodeTopToBottom {
	/**
	 * 遍历已经加入treenode 获取节点 判断左右 不为null 加入节点左节点 加入左节点值
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> print(TreeNode root){
		ArrayList<Integer> list=new ArrayList<>();
		if(root==null){
			return list;
		}
		ArrayList<TreeNode> res=new ArrayList<>();
		res.add(root);
		list.add(root.val);
		for (int i = 0; i < res.size(); i++) {
			TreeNode node=res.get(i);
			if(node.left!=null){
				res.add(node.left);
				list.add(node.left.val);
			}
			if(node.right!=null){
				res.add(node.right);
				list.add(node.right.val);
			}
			
		}
		return list;
	}
	 ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
	        ArrayList<ArrayList<Integer> > resList=new ArrayList<>();
	    
			if(pRoot==null){
				return resList;
			}
			Queue<TreeNode> queue=new LinkedList<TreeNode>();
			queue.add(pRoot);
			//list.add(pRoot.val);
	        while(!queue.isEmpty()){
	            ArrayList<Integer>  res=new ArrayList<>();
			for (int i = 0; i < queue.size(); i++) {
				//TreeNode node=res.get(i);
	            if(queue.peek().left!=null){
				//if(node.left!=null){
					queue.add(queue.peek().left);
					//list.add(node.left.val);
				}
				//if(node.right!=null){
	            if(queue.peek().right!=null){
					queue.add(queue.peek().right);
					//list.add(node.right.val);
				}
	           
	                res.add(queue.poll().val);
	            
	            
			}
	             resList.add(res);
	        }    
	       
			return resList;
	    }
}
