package recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMaizePaths {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int destinationRow=scanner.nextInt();
        int destinationColumn=scanner.nextInt();
        ArrayList<String>paths=getMaize(1,1,destinationRow,destinationColumn);
        System.out.println(paths);
    }

    private static ArrayList<String> getMaize(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn) {
        if (sourceRow==destinationRow && sourceColumn ==destinationColumn){
            ArrayList<String>baseResult=new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        ArrayList<String> horizontalPaths =new ArrayList<>();
        ArrayList<String> verticalPaths=new ArrayList<>();
       if(sourceColumn<destinationColumn) {
            horizontalPaths = getMaize(sourceRow, sourceColumn + 1, destinationRow, destinationColumn);
       }
       if (sourceRow<destinationRow){
        verticalPaths=getMaize(sourceRow+1,sourceColumn,destinationRow,destinationColumn);
       }
        ArrayList<String>paths=new ArrayList<>();
        for (String horizontalPath:horizontalPaths
             ) {
            paths.add("h"+horizontalPath);
        }
        for (String verticalPath :verticalPaths
        ) {
            paths.add("v"+verticalPath);
        }
        return paths;
    }
}
