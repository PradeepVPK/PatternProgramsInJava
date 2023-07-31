import java.util.Scanner;

public class _9_mirror_right {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for (int i=0;i<=n;i++) {

            for (int j = 0; j <= n; j++) {
                if (i + j == n||j>n-i) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
