package recurssion;

import java.util.Scanner;

public class PrintEncodings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        String answerSoFar="";
        printEncoding(str,answerSoFar);
    }

    private static void printEncoding(String question, String answerSoFar) {
        if (question.length()==0){
            System.out.println(answerSoFar);
            return;
        } else if (question.length()==1) {
            char ch=question.charAt(0);
            if (ch=='0'){
                return;
            }
            else {
                int valueOfCh=ch-'0';
                char code=(char) ('a'+valueOfCh-1);
                System.out.println(answerSoFar+code);
            }
        }
        else {
            char ch=question.charAt(0);
            String restOfString=question.substring(1);
            if (ch=='0'){
                return;
            }
            else {
                int numericValueOfCh=ch='0';
                char code=(char) ('a'+numericValueOfCh-1);
                printEncoding(restOfString,answerSoFar+code);
            }
            String ch12=question.substring(0,2);
            String restOfQuestion12=question.substring(2);
            int numericValueOFCh12=Integer.valueOf(ch12);
            if (numericValueOFCh12<=26){
                char code=(char) ('a'+numericValueOFCh12-1);
                printEncoding(restOfQuestion12,answerSoFar+code);
            }
        }
    }
}
