import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayi giriniz : ");
        sayi = scan.nextInt();
        for (int i = 0;i<=sayi;i++)
        {
            for (int j =0;j<sayi-i;j++)
            {
                System.out.print(" ");
            }
            for (int n = 1;n<=2*i+1 ;n++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = sayi-1; i >= 0; i--) {
            for (int j = (sayi - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
