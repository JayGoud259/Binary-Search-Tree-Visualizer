//LINE 1 TO LINE 70 WRITTEN BY MEET PUNAMIYA 1012411186
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class MainMeet {

    static Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);

        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int choice, value;

        do {
            System.out.println("1. Insert Node");
            System.out.println("2. Display Inorder");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    root = insert(root, value);
                    break;

                case 2:
                    System.out.print("Inorder Traversal: ");
                    inorder(root);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
//ALL THE ABOVE LINES ARE WRITTEN BY MEET PUNAMIYA 1012411186
        
        sc.close();
    }
}
