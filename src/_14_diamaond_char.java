import java.util.Scanner;

public class _14_diamaond_char {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char ch='A';
        n = (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("" + (char) (ch+k-1));
                if (j < (2 * i + 1) / 2)
                    k++;
                else
                    k--;
            }
            System.out.println();
        }
        n = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("" + (char)(ch+k-1));
                if (j < (2 * (n - i) - 1) / 2)
                    k++;
                else
                    k--;
            }
            System.out.println();
        }
    }
    }

