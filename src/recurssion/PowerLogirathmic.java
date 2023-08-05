package recurssion;

import java.util.Scanner;

public class PowerLogirathmic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int x=scanner.nextInt();
        int xn=power(x,n);
        System.out.println(xn);

    }

    private static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xpnb2=power(x,n/2);
        int xn=xpnb2*xpnb2;
        if (n%2==1){
            xn=xn*x;
        }
        return xn;
    }
}
