import java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Harmonikleri Bulunacak Sayıyı Giriniz : ");
        int n = input.nextInt();
        double h=0;
        for(double i=1;i<=n;i++){
            h+=(1/i);
        }
        System.out.print("Harmonik Toplamı = "+h);
    }
}
