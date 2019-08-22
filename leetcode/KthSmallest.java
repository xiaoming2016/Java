class Solution{
/*
思路：二叉搜索树中序遍历就是从小到大的

int val=0;
int i=0;
public int kthSmallest(TreeNode root,int k){
  print(root,k);
return val;
}
public void print(TreeNode root,int k){
  if(root==null) return;
  print(root.left);
  if(k==++i){
    val=root.val;
  }
  print(root.right);
}


}
