package algorythim;


// Huffman Coding in Java

import java.util.PriorityQueue;
        import java.util.Comparator;

class Node {
    int freq;
    char c;
    Node left;
    Node right;
}

// For comparing the nodes
class HuffmanComparator implements Comparator<Node> {
    public int compare(Node x, Node y) {
        return x.freq - y.freq;
    }
}


public class Huffman {
    public static void printCode(Node root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {

            System.out.println(root.c + "   |  " + s);

            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }



    public static void main(String[] args) {

        int n = 4;
        char[] charArray = { 'A', 'B', 'C', 'D' };
        int[] charfreq = { 5, 1, 6, 3 };

        PriorityQueue<Node> q = new PriorityQueue<Node>(n, new HuffmanComparator());

        for (int i = 0; i < n; i++) {
            Node hn = new Node();

            hn.c = charArray[i];
            hn.freq = charfreq[i];

            hn.left = null;
            hn.right = null;

            q.add(hn);
        }

        Node root = null;

        while (q.size() > 1) {

            Node x = q.peek();
            q.poll();

            Node y = q.peek();
            q.poll();

            Node f = new Node();

            f.freq = x.freq + y.freq;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;

            q.add(f);
        }

        printCode(root, "");
    }
}

//https://kodlogs.com/blog/10978/encoding-and-decoding-huffman-code-in-java
//https://www.geeksforgeeks.org/huffman-decoding/