package recurssion;

import java.util.Scanner;

public class PrintKeyPadCombinations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        printKeyPadCombinations(str,"");

    }
    static String[]codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    private static void printKeyPadCombinations(String question, String ans) {
        if(question.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=question.charAt(0);
        String restOfQuestion=question.substring(1);
        String codeForCh=codes[ch-'0'];
        for (int i = 0; i < codeForCh.length(); i++) {
            char charOption =codeForCh.charAt(i);
            printKeyPadCombinations(restOfQuestion,ans+charOption);

        }

    }
}
