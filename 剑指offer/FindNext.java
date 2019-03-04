package offer;

import javax.swing.tree.TreeNode;



public class FindNext {
	public TreeNode GetNext(TreeNode pNode)
    {
        if(pNode==null){
            return null;
        }
        
        if(pNode.right!=null){
            return getMostLeft(pNode.right);
        }else{
        
        if(pNode.next==null){
              return null;
           }
         if(pNode.next.left==pNode){
                return pNode.next;
            }
           
         while(pNode.next.right==pNode){
                pNode=pNode.next;
                if(pNode.next==null){//忘了
                    return null;
                }
            }
        
        }
        return pNode.next;
        
    }
	
	
public static TreeNode getMostLeft(TreeNode node) {
	if (node == null) {
		return node;
	}
	while (node.left!=null) {
		return node=node.left;
	}
	return node;
}
	/**
	 * 1.是否有右子树 有就找右子树最左的节点
	 * 2.若无右子树 无左子树返回null 当前节点的后继节点的左孩子如果是本身 返回 当前节点后继(next) 
	 * 3.while 当前节点后继的右孩子是本身 当前节点=当前的后继 其中如当前的后继为空返回null
	 * @param node
	 * @return
	 */
	public TreeNode findNext(TreeNode node){
		if(node==null){
			return null;
		}
		if(node.right!=null){
			return getMostLeft(node.right);
		}else{
			if(node.next==null){
				return null;
			}
			if(node.next.left==node){
				return node.next;
			}
			while(node.next.right==node){
				if(node.next==null){
					return null;
				}
				node=node.next;
			}
		}
		return node.next;
	}
	public TreeNode getMostLeft(TreeNode node){
		if(node==null){
			return null;
		}
		while(node.left!=null){
			node=node.left;
		}
		return node;
	}

}
