import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyeli Hesaplanacak Sayıyı Giriniz : ");
        int n = input.nextInt();
        int sayi=1;
        for (int i=1;i<=n;i++){
            sayi*=i;
        }
        System.out.println(n+" Sayısının Faktöriyeli = "+sayi);
    }
}
