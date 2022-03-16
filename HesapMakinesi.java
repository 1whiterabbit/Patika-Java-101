import java.util.Scanner;
public class HesapMakinesi {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,islem,sonuc;
        System.out.print("İlk sayıyı giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        sayi2 = input.nextInt();

        System.out.println("1 - Toplama\n2 - Çıkartma\n3 - Çarpma\n4 - Bölme");
        System.out.print("Yapılacak işlemin kodunu giriniz : ");

        islem= input.nextInt();

        switch (islem){
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("İşlemin sonucu : " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("İşlemin sonucu : " + sonuc);
                break;
            case 3:
                if (sayi2==0){
                    System.out.println("Sayı/0 = sonsuz");
                } else {
                    sonuc = sayi1 * sayi2;
                    System.out.println("İşlemin sonucu : " + sonuc);
                }
                break;
            case 4:
                sonuc = sayi1 / sayi2;
                System.out.println("İşlemin sonucu : " + sonuc);
                break;
            default:
                System.out.println("Girdiğiniz kod geçersizdir!");
                break;

        }
    }
}
