import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        int n = input.nextInt();
        System.out.print("Üs giriniz : ");
        int x = input.nextInt();
        int ifade=1;
        for (int i = 1; i <= x; i++) {
            ifade *= n;
        }
        System.out.print(n + " sayısının " + x + " kuvveti = " + ifade);
    }
}
