package codesignal;


public class Palindrome {

    private static boolean solution(String input) {

        StringBuilder sb = new StringBuilder();
       for (int i=input.length()-1;i>=0; i--){
           sb.append(input.charAt(i));
       }

       if(input.equals(sb.toString())){
           return true;
       }
       return false;

    }

    public static void main(String[] args) {


        System.out.println(solution("aaabbbaaa"));

    }
}
