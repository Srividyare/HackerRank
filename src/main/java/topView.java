/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
 {
    if (root == null) return;
    
     top_view(root.left);
    if(root.left != null || root.right != null)
        System.out.print(root.data + " ");
   
    top_view(root.right);
  
}
