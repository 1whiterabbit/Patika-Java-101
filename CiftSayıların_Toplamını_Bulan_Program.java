import java.util.Scanner;

public class CiftSayıların_Toplamını_Bulan_Program {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n,x;
        do{
            System.out.print("Cift Sayı Giriniz : ");
            n = input.nextInt();
            x=0;
            for(int i=0;i<=n;i++) {
                if (i % 4 == 0) {
                    x += i;
                }
            }
            System.out.println(n + " sayısına kadar olan 4'ün katları toplamı = " + x);
        }while (n%2==0);
    }
}
