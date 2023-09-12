package recurssion;

import java.util.Scanner;

public class PrintStairPaths {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int stairs=scanner.nextInt();
        printStairPaths(stairs,"");
    }

    private static void printStairPaths(int stairs, String path) {
        if (stairs<0){
            return;
        }
        if (stairs==0){
            System.out.println(path);
            return;
        }
        printStairPaths(stairs-1,path+"1");
        printStairPaths(stairs-2,path+"2");
        printStairPaths(stairs-3,path+"3");

    }
}
