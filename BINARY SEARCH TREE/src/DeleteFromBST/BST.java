package DeleteFromBST;

public class BST {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(root.data > value){
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int value){
        if(root == null){
            return false;
        }

        if(root.data == value){
            return true;
        }

        if(root.data > value){
            return search(root.left, value);
        }
        else{
            return search(root.right, value);
        }
    }

    public static Node delete(Node root, int value){
        if(root.data < value){
            root.right = delete(root.right, value);
        }
        else if(root.data > value){
            root.left = delete(root.left, value);
        }
        else{
            //Case 1 - Leaf Node
            if(root.left == null && root.right == null){
                return null;
            }

            //Case 2 - One child
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //Case 3 - Both children
            //Inorder successor
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);

        root = delete(root, 5);
        System.out.println();

        inOrder(root);
        System.out.println();
    }
}
