package Insertion;

public class AVL {
    Node root;

    public static class Node{
        int data, height;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    public int height(Node N){
        if(N == null){
            return 0;
        }
        return N.height;
    }

    public int getBalance(Node N){
        if(N == null){
            return 0;
        }
        return height(N.left) - height(N.right);
    }

    public int getMax(int a, int b){
        return Math.max(a, b);
    }

    public Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        //rotation
        x.right = y;
        y.left = T2;

        y.height = getMax(height(y.left), height(y.right)) + 1;
        x.height = getMax(height(x.left), height(x.right)) + 1;

        return x;
    }

    public Node leftRotation(Node x){
        Node y = x.right;
        Node T2 = y.left;

        //rotation
        y.left = x;
        x.right = T2;

        y.height = getMax(height(y.left), height(y.right)) + 1;
        x.height = getMax(height(x.left), height(x.right)) + 1;

        return y;
    }

    public Node insert(Node root, int data){
        if(root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
                root.left = insert(root.left, data);
        } else if(data > root.data){
                root.right = insert(root.right, data);
        }
        else{
            return root;
        }

        root.height = 1 + getMax(height(root.left), height(root.right));

        int balance = getBalance(root);

        //Left Left Case
        if(balance > 1 && data < root.left.data){
            return rightRotate(root);
        }

        //Right Right Case
        if(balance < -1 && data > root.right.data){
            return leftRotation(root);
        }

        //Left Right Case
        if(balance > 1 && data > root.left.data){
            root.left = leftRotation(root);
            return rightRotate(root);
        }

        //Right Left Case
        if(balance < -1 && data < root.right.data){
            root.right = rightRotate(root);
            return  leftRotation(root);
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

    public static void main(String[] args) {
        AVL tree = new AVL();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        inOrder(tree.root);
        System.out.println();
    }


}
