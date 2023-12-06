package hackerrank;


public class Straicase {

    public static void staircase(int n) {
        // Write your code here

        for (int i=1; i<=n; i++) {
            int spaces = n-i;
            StringBuilder str = new StringBuilder();
            for (int sp=0; sp<spaces; sp++) {
                str.append(" ");
            }
            for(int hash =0; hash < i; hash++) {
                str.append("#");
            }
            System.out.println(str);
        }

    }

    public static void main(String[] args) {
        staircase(6);

    }
}
