import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunu Giriniz : ");
        int mat = input.nextInt();
        System.out.print("Fizik Notunu Giriniz : ");
        int fiz = input.nextInt();
        System.out.print("Kimya Notunu Giriniz : ");
        int kim = input.nextInt();
        System.out.print("Türkçe Notunu Giriniz : ");
        int tur = input.nextInt();
        System.out.print("Tarih Notunu Giriniz : ");
        int tar = input.nextInt();
        System.out.print("Müzik Notunu Giriniz : ");
        int muz = input.nextInt();
        double ort = (mat + fiz + kim + tur + tar + muz) / 6.0;
        System.out.println("Ortalamanız : " + ort);
        boolean gecmeDurumu = ort >= 60.0D;
        String sonuc = gecmeDurumu ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);
    }
}