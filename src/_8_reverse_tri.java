import java.util.Scanner;

public class _8_reverse_tri {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for (int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                if(j<i){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");

            }
            System.out.println("");
        }

    }
}
