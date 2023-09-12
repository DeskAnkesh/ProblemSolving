package recurssion;

import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String question=scanner.next();
        printSubSequence(question,"");
    }

    private static void printSubSequence(String question, String ans) {
        if (question.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=question.charAt(0);
        String restOfQuestion=question.substring(1);
        printSubSequence(restOfQuestion,ans+ch);
        printSubSequence(restOfQuestion,ans+"");
    }
}
