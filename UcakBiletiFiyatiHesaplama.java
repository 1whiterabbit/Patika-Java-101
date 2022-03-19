import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double mesafe,yas,indirim,toplam;
        double indirimorani;
        int yoltipi;

        System.out.print("Mesafe'yi KM Cinsinden Giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk Türünün Kodunu Giriniz (Tek Yön - 1 , Gidiş-Dönüş - 2 ) : ");
        yoltipi = input.nextInt();

        if (yas<12){
            indirimorani = 0.5;
        } else if(12<=yas && yas<=24){
            indirimorani = 0.1;
        } else if (65<yas){
            indirimorani = 0.3;
        } else {
            indirimorani = 1.0;
        }
        indirim = (mesafe*0.10)*indirimorani;
        toplam = (mesafe*0.10)-indirim;
        switch (yoltipi){
            case 1:
                System.out.println("Toplam Tutar : "+toplam + " TL");
                break;
            case 2:
                System.out.println("Toplam Tutar : "+toplam*2 + " TL");
                break;
            default:
                System.out.println("Geçerli Bir Yolculuk Türü Seçiniz !");
                break;
        }


    }
}
