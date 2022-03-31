import java.util.Scanner;

public class FibonacciSerisi {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısını Giriniz : ");
        int sayi = input.nextInt();
        int x=0,y=1,sonuc;
        System.out.print(0 + " " + 1);
        for (int i =2;i<sayi;i++){
            sonuc=x+y;
            System.out.print(" "+sonuc);
            x=y;
            y=sonuc;
        }
    }
}
