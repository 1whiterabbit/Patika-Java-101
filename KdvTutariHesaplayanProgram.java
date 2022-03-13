import java.util.Scanner;

public class KdvTutariHesaplayanProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double urunFiyati,kdvOrani,urununKdvsi,kdvliUrunFiyati;
        System.out.print("Ürün Fiyatını Giriniz : ");
        urunFiyati = input.nextInt();
        kdvOrani = (urunFiyati<1000) ? 0.18 : 0.08;
        System.out.println("Kdv oranı : " + kdvOrani);
        urununKdvsi = urunFiyati*kdvOrani;
        System.out.println("Ürünün Kdv Tutarı : " + urununKdvsi + " tl");
        kdvliUrunFiyati = urunFiyati + urununKdvsi;
        System.out.println("Kdv'li Ürün Fiyatı : " + kdvliUrunFiyati + " tl");
    }
}
