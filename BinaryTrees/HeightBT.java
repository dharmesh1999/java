package BinaryTrees.java;

public class HeightBT {
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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        int height = Math.max(lh, rh) + 1;

        return height;
    }

    public static int count(Node root) {
        if (root.left == null && root.right == null) {
            return 1;
        }

        int lc = count(root.left);
        int rc = count(root.right);

        return lc + rc;
    }

    public static int countSum(Node root) {
        if (root == null) {
            return 0;
        }

        int lc = countSum(root.left);
        int rc = countSum(root.right);

        return lc + rc + root.data;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(countSum(root));
    }
}
