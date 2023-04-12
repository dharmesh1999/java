package BinaryTrees;

public class Univalued {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String args[]) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(9);
        root.left.right = new Node(10);
        root.right.left = new Node(1);
        // root.right.right = new Node(7);

        int n = 10, k = 1;
        System.out.println(KAncestor(root, n, k));
    }
}
