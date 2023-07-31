import java.util.Scanner;

public class _11_diamond {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int spaces=n/2;
        int stars=1;
        for(int i=1;i<=n;i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            System.out.println("");
            if(i<=n/2){
                spaces--;
                stars+=2;
            }
            else {
                spaces++;
                stars-=2;
            }
        }
    }
}
