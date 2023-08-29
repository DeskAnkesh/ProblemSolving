package recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnKeyPadCombination {
    public static void main(String[] args) {
        Scanner scn=  new Scanner(System.in);
        String str= String.valueOf(scn.nextInt());
        ArrayList<String>words=getKeypadCombinations( str);
        System.out.println(words);


    }
    public static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    private static ArrayList<String> getKeypadCombinations(String str) {
        if (str.length()==0){
            ArrayList<String> baseResult=new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char character=str.charAt(0);
        String restOfString=str.substring(1);
        ArrayList<String>restOfResult=getKeypadCombinations(restOfString);
        ArrayList<String>myResult=new ArrayList<>();
        String codeForCharacter=codes[character-'0'];
        for (int i=0;i<codeForCharacter.length();i++){
            char characterCode=codeForCharacter.charAt(i);
            for (String rest:restOfResult
                 ) {
                myResult.add(rest+characterCode);
            }
        }
        return myResult;
    }
}
