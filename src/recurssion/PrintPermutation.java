package recurssion;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        String answerSoFar="";
        printPermutations(str,answerSoFar);
    }

    private static void printPermutations(String question, String answerSoFar) {
        if (question.length()==0){
            System.out.println(answerSoFar);
            return;
        }
        for (int i = 0; i < question.length(); i++) {
            char ch=question.charAt(i);
            String questLeftPart=question.substring(0,i);
            String questRightPart=question.substring(i+1);
            String restOfQuestion=questLeftPart+questRightPart;
            printPermutations(restOfQuestion,answerSoFar+ch);

        }
    }
}
