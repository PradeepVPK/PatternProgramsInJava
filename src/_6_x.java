import java.util.Scanner;

public class _6_x {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for (int i=0;i<=n;i++){

            for (int j=0;j<=n;j++){
                if(i==j||i+j==n) {
                    System.out.print("*");
                }

                else
                    System.out.print(" ");
            }
            System.out.println("");
        }


    }
}
