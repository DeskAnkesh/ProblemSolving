package recurssion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsequenceString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String you want to print the subsequence of: ");
        String string=scanner.next();
        List<String> lastIndex=findSubsequence(string);
        System.out.println(lastIndex);
    }

    private static List<String> findSubsequence(String string) {
        if (string.length()==0){
            ArrayList<String>baseSubsequence=new ArrayList<>();
            baseSubsequence.add("");
            return baseSubsequence;
        }
        char c=string.charAt(0);
        String restOfString =string.substring(1);
        List<String>subsequenceForSmallerString=findSubsequence(restOfString);
        List<String>subsequnece=new ArrayList<>();
        for(String s:subsequenceForSmallerString){
            subsequnece.add(s+"");
            subsequnece.add(s+c);
        }
        return subsequnece;
    }
}
