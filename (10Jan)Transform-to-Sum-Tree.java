class Solution{
    public void toSumTree(Node root){
         dfs(root);
    }
    public int dfs(Node root){
        if(root==null){
            return 0;
        }
        int rootVal = root.data;
        int childrenSum = dfs(root.left)+dfs(root.right);
        root.data = childrenSum;
        return childrenSum + rootVal;
    }
}
