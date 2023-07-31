import java.util.Scanner;

public class _1_EQ_tri {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for (int i=0;i<n;i++){
            for (int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
