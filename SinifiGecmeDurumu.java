import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, tur, kim, muz;
        double ortalama;

        System.out.print("Matematik Notu : ");
        mat = input.nextInt();
        System.out.print("Fizik Notu : ");
        fiz = input.nextInt();
        System.out.print("Türkçe Notu : ");
        tur = input.nextInt();
        System.out.print("Kimya Notu : ");
        kim = input.nextInt();
        System.out.print("Müzik Notu : ");
        muz = input.nextInt();

        ortalama = (mat + fiz + tur + kim + muz) / 5;
        if (ortalama < 55) {
            System.out.println("Ortalamanız : " + ortalama + " Sonuç : Kaldı");
        } else {
            System.out.println("Ortalamanız : " + ortalama + " Sonuç : Geçti");
        }
    }

}
