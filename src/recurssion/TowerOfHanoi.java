package recurssion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int t1d=scanner.nextInt();
        int t2d=scanner.nextInt();
        int t3d=scanner.nextInt();
        toh(n,t1d,t2d,t3d);
    }

    private static void toh(int n, int t1d, int t2d, int t3d) {
        if (n == 0) {
        return;
        }
        toh(n-1,t1d,t3d,t2d);
        System.out.println(n+"["+t1d+"->"+t2d+"]");
        toh(n-1,t3d,t2d,t1d);
    }
}
