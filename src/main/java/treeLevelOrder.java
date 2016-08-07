   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   

    void LevelOrder(Node root)
    {
        int ht = getht(root);
        for (int i=1; i<=ht; i++)
            printLevel(root, i);
    }
 

    int getht(Node root)
    {
        if (root == null)
           return 0;
        else
        {
           
            int lht = getht(root.left);
            int rht = getht(root.right);
             
           
            if (lht > rht)
                return(lht+1);
            else return(rht+1); 
        }
    }
 
    void printLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printLevel(root.left, level-1);
            printLevel(root.right, level-1);
        }
    }
     
  
