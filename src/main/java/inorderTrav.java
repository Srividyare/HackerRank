/* Inorder traversal */

class Node {
    int data;
    Node left;
    Node right;
}



void inOrder(Node root) {
    if(root == null) return;
    
    inOrder(root.left);
    System.out.print(root.data + "\t");
    inOrder(root.right);

}
