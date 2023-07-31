import java.util.Scanner;

public class _5_box_x {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for (int i=0;i<=n;i++){

            for (int j=0;j<=n;j++){
                if(j==0||j==n||i==0||i==n||i==j||i+j==n) {
                    System.out.print("*");
                }

                else
                    System.out.print(" ");
            }
            System.out.println("");
        }

    }}
