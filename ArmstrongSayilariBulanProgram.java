import java.util.Scanner;

public class ArmstrongSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi;
        int toplam=0;

        sayi=scanner.nextInt();

        while(sayi!=0) {
            int rakam=sayi%10;
            toplam=rakam+toplam;
            sayi=sayi/10;
        }
        System.out.println("Sayıların Toplamı:"+toplam);
    }
}
