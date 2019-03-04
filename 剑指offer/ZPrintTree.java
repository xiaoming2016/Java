package offer;

import java.util.ArrayList;
import java.util.Stack;

public class ZPrintTree {
	public ArrayList<ArrayList<Integer> > print(TreeNode pRoot){
		 ArrayList<ArrayList<Integer> >  res_list = new ArrayList<>();
		int layer = 1;
        //s1存奇数层节点
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        s1.push(pRoot);
        //s2存偶数层节点
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        while(!s1.empty() || !s2.empty()){
            if(layer%2 != 0){
                ArrayList<Integer> list = new ArrayList<>();
                while(!s1.empty()){
                    TreeNode t = s1.pop();//弹出
                    if(t != null){
                        list.add(t.val);
                        s2.push(t.left);//全是s2 t是奇数层 t.left 偶数层
                        s2.push(t.right);
                    }
                }
                if (!list.isEmpty()) {
                    res_list.add(list);
                    layer++;//不要
                }
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                while(!s2.empty()){
                    TreeNode t = s2.pop();
                    if(t != null){
                        list.add(t.val);
                        s1.push(t.right);
                        s1.push(t.left);
                    }
                }
                if (!list.isEmpty()) {
                    res_list.add(list);
                    layer++;
                }
            }
        }
        return res_list;

	}
	public ArrayList<ArrayList<Integer> > Zprint(TreeNode pRoot){
		ArrayList<ArrayList<Integer>> resList=new ArrayList<>();
		if(pRoot==null){
			return resList;
		}
		Stack<TreeNode> s1=new Stack<>();//两个stack
		Stack<TreeNode> s2=new Stack<>();
		s1.push(pRoot);
		int layer=1;
		while (!s1.isEmpty()) {
			if(layer%2!=0){
				ArrayList<Integer> res=new ArrayList<>();
				//while(!res.isEmpty()){//错误
					while(!s1.isEmpty()){//s1.
					TreeNode node=s1.pop();
					if (node!=null) {
						res.add(node.val);
						s2.push(node.left);
						s2.push(node.right);
					}
				}
				if(!res.isEmpty()){//忘了
					resList.add(res);
					layer++;
				}
			}else{
				ArrayList<Integer> res=new ArrayList<>();
				while (!s2.isEmpty()) {
					TreeNode node=s2.pop();
					if(node!=null){
						res.add(node.val);
						s1.push(node.left);
						s1.push(node.right);
					}
					
				}
				if (!res.isEmpty()) {
					resList.add(res);
					layer++;
				}
			}
			
		}
		return resList;
	}
	public ArrayList<ArrayList<Integer> > Zprint2(TreeNode pRoot){
		ArrayList<ArrayList<Integer>> resList=new ArrayList<>();
		if(pRoot==null){
			return resList;
		}
		Stack<TreeNode> s1=new Stack<>();
		Stack<TreeNode> s2=new Stack<>(); 
		
		s1.push(pRoot);
		
		int layer=1;
		while(!s1.isEmpty()){
			if(layer%2!=0){
				ArrayList<Integer> list=new ArrayList<>();
				while(!s1.isEmpty()) {
					TreeNode node=s1.pop();
					if (node!=null) {
						list.add(node.val);
						s2.push(node.left);
						s2.push(node.right);
					}
					if(!list.isEmpty()){
						resList.add(list);
						layer++;
					}
				}
			}else{
				ArrayList<Integer> list=new ArrayList<>();
				while (!s2.isEmpty()) {
					TreeNode node=s2.pop();
					if(node!=null){
						list.add(node.val);
						s1.push(node.left);
						s1.push(node.right);
					}
				}
				if(!list.isEmpty()){
					resList.add(list);
					layer++;
				}
			}
		}
		return resList;
	}
}
