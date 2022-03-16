import java.util.Scanner;
public class KullaniciGirisi {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int sifre,giris,kod,yenisifre;
        sifre = 1234;
        System.out.print("Şifreyi Giriniz : ");
        giris = input.nextInt();
        if (giris!=sifre){
            System.out.println("Şifre Hatalı!");
            System.out.println("Devam Etmek İçin Aşağıdaki Kodlardan Birini Giriniz");
            System.out.println("1 - Yeni Şifre Oluştur");
            System.out.println("2 - Programdan Çık");
            System.out.print("Kod Numarası : ");
            kod = input.nextInt();

            if (kod==1){
                System.out.print("Yeni Şifreyi Giriniz : ");
                yenisifre = input.nextInt();
                if (yenisifre==sifre){
                    System.out.println("Şifre Oluşturulamadı! Lütfen Eski Şifreden Farklı Bir Şifre Giriniz!");
                } else {
                    System.out.println("Yeni Şifre Oluşturuldu");
                }
            } else{
                System.out.println("Program Sonlandırıldı");
            }

        } else {
            System.out.println("Giriş Başarıyla Yapılmıştır!");
        }

    }
}
