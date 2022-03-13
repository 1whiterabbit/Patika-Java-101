import java.util.Scanner;

public class KdvTutariHesaplayanProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double urunFiyati,kdvTutari,urununKdvsi,kdvliUrunFiyati;
        System.out.print("Ürün Fiyatını Giriniz : ");
        urunFiyati = input.nextInt();
        kdvTutari = 0.18;
        System.out.println("Kdv oranı : % 18 ");
        urununKdvsi = urunFiyati*kdvTutari;
        System.out.println("Ürünün Kdv Tutarı : " + urununKdvsi + " tl");
        kdvliUrunFiyati = urunFiyati + urununKdvsi;
        System.out.println("Kdv'li Ürün Fiyatı : " + kdvliUrunFiyati + " tl");
    }
}
