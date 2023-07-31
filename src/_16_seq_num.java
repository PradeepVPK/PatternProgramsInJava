import java.util.Scanner;

public class _16_seq_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(k+" ");
                k++;
            }

            System.out.println();
        }
    }
}
