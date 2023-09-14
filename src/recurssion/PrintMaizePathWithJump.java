package recurssion;

import java.util.Scanner;

public class PrintMaizePathWithJump {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int destinationRow=scanner.nextInt();
        int destinationColumn=scanner.nextInt();
        int sourceRow=1,sourceColumn=1;
        String pathSoFar="";
        printMaizeWithJump(sourceRow,sourceColumn,destinationRow,destinationColumn,pathSoFar);

    }

    private static void printMaizeWithJump(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn, String pathSoFar) {
        if (sourceRow==sourceColumn &&sourceColumn==destinationColumn){
            System.out.println(pathSoFar);
            return;
        }
        //Vertical move
        for (int moveSize = 1; moveSize <=destinationRow-sourceRow ; moveSize++) {
            printMaizeWithJump(sourceRow+moveSize,sourceColumn,destinationRow,destinationColumn,pathSoFar+"V"+moveSize);

        }
        //Horizontal move
        for (int moveSize = 1; moveSize <=destinationColumn-sourceColumn ; moveSize++) {
            printMaizeWithJump(sourceRow,sourceColumn+moveSize,destinationRow,destinationColumn,pathSoFar+"H"+moveSize);

        }
        //Diagonal move
        for (int moveSize = 1; moveSize <=destinationRow-sourceRow && moveSize<=destinationColumn-sourceColumn; moveSize++) {
            printMaizeWithJump(sourceRow+moveSize,sourceColumn+moveSize,destinationRow,destinationColumn,pathSoFar+"D"+moveSize);

        }
    }
}
