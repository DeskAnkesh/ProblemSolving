package recurssion;

import java.util.Scanner;

public class PrintMaizePath {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int destinationRow=scanner.nextInt();
        int destinationColumn=scanner.nextInt();
        int sourceRow=1;
        int sourceColumn=1;
        String pathSoFar="";
        printMaizePath(sourceRow,sourceColumn,destinationRow,destinationColumn,pathSoFar);
    }

    private static void printMaizePath(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn, String pathSoFar) {
        if (sourceRow>destinationRow || sourceColumn>destinationColumn){
            return;
        }
        if (sourceRow==destinationRow && sourceColumn==destinationColumn){
            System.out.println(pathSoFar);
        }
        printMaizePath(sourceRow,sourceColumn+1,destinationRow,destinationColumn,pathSoFar+"h");
        printMaizePath(sourceRow+1,sourceColumn,destinationRow,destinationColumn,pathSoFar+"v");
    }
}
