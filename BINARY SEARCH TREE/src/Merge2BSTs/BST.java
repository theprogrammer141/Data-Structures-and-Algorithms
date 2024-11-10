package Merge2BSTs;

import javax.swing.*;
import java.util.ArrayList;

public class BST {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void getInOrder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        getInOrder(root.left, arr);
        arr.add(root.data);
        getInOrder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }

    public static Node mergeBSTs(Node root1, Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInOrder(root1, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInOrder(root2, arr2);

        int i = 0, j = 0;
        ArrayList<Integer> finalArray = new ArrayList<>();

        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalArray.add(arr1.get(i));
                i++;
            }
            else{
                finalArray.add(arr2.get(j));
                j++;
            }
        }

        while(i < arr1.size()){
            finalArray.add(arr1.get(i));
            i++;
        }

        while(j < arr2.size()){
            finalArray.add(arr2.get(j));
            j++;
        }

        return createBST(finalArray, 0, finalArray.size() - 1);
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preOrder(root);

    }
}
