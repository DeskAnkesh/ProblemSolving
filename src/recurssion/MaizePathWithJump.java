package recurssion;

import javax.swing.plaf.SplitPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class MaizePathWithJump {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int destinationRow=scanner.nextInt();
        int destinationColumn=scanner.nextInt();
        ArrayList<String>paths=getMaizePathsWithJump(1,1,destinationRow,destinationColumn);
        System.out.println(paths);
    }

    private static ArrayList<String> getMaizePathsWithJump(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn) {
        if ( sourceRow==destinationRow &&sourceColumn==destinationColumn){
            ArrayList<String>baseResult=new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        //horizontal moves
        ArrayList<String>paaths=new ArrayList<>();
        for (int moveSize = 1; moveSize <= destinationColumn-sourceColumn; moveSize++) {
            ArrayList<String>horizontalPaths=getMaizePathsWithJump(sourceRow,sourceColumn+moveSize,destinationRow,destinationColumn);
            for (String horizontalpath:horizontalPaths
                 ) {
                paaths.add("h"+moveSize+horizontalpath);
            }
        }

        //Vertical Moves

        for (int moveSize = 1; moveSize <=destinationRow-sourceRow; moveSize++) {
            ArrayList<String>verticalPaths=getMaizePathsWithJump(sourceRow+moveSize,sourceColumn,destinationRow,destinationColumn);
            for (String verticalPath:verticalPaths
            ) {
                paaths.add("v"+moveSize+verticalPath);
            }
        }

        for (int moveSize = 1; moveSize <= destinationRow-sourceRow && moveSize<destinationColumn-sourceColumn; moveSize++) {
            ArrayList<String>diagonalPaths=getMaizePathsWithJump(sourceRow+moveSize,sourceColumn+moveSize,destinationRow,destinationColumn);
            for (String diagonalPath:diagonalPaths
            ) {
                paaths.add("d"+moveSize+diagonalPath);
            }
        }

        return paaths;
    }


}
