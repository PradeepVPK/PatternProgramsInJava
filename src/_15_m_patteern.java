public class _15_m_patteern {
    public static void main(String[] args) {
        int spaces=8;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
            spaces-=2;
        }
    }
}
