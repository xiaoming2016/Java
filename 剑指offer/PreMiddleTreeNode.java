package offer;

import java.util.HashMap;

public class PreMiddleTreeNode {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null ||in==null){
            return null;
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<in.length;i++){
            hm.put(in[i],i);
        }
        return preIn(pre,0,pre.length-1,in,0,in.length-1,hm);
    }
    public TreeNode preIn(int[] pre,int pi,int pj,int[] in,int ni,int nj,HashMap<Integer,Integer> map){
        
        if(pi>pj){
            return null;
        }
        TreeNode head=new TreeNode(pre[pi]);
        int index=map.get(pre[pi]);
        head.left=preIn(pre,pi+1,pi+index-ni,in,ni,index-1,map);
        head.right=preIn(pre,pi+index-ni+1,pj,in,index+1,nj,map);
        return head;
    }
    /**
     * hashmap存
     * @param pre
     * @param in
     * @return
     */
    public TreeNode reConstructBinaryTree2(int [] pre,int [] in) {
    	if(pre==null||in==null){
    		return null;
    	}
    	HashMap<Integer, Integer> hm=new HashMap<>();
    	for (int i = 0; i < in.length; i++) {
			hm.put(in[i], i);
		}
    	return preIn2(pre,0,pre.length-1,in,0,in.length-1,hm);
    }
    public TreeNode preIn2(int[] pre,int pi,int pj,int[] in,int ni,int nj,HashMap<Integer, Integer> hm){
    	TreeNode node=new TreeNode(pre[pi]);//先加头节点
    	int index=hm.get(pre[pi]);
    	if(pi>pj){
    		return null;
    	}
    	node.left=preIn(pre,pi+1,pi+index-ni,in,ni,index-1,hm);
    	node.right=preIn(pre,pi+index-ni+1,pj,in,index+1,nj,hm);
    	return node;
    	
    }
    
}





class TreeNode{
	TreeNode left;
	TreeNode right;
	int val;
	TreeNode(int val){
		this.val=val;
	}
}
