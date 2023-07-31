import java.util.Scanner;

public class _3_box {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for (int i=0;i<n;i++){

            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
