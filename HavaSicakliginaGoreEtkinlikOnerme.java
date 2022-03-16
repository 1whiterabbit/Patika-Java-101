import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;
        System.out.print("Hava Sıcaklığını Giriniz : ");
        sicaklik = input.nextInt();
        if (sicaklik < 5) {
            System.out.println("Kayak");
        } else if (5 <= sicaklik && sicaklik < 15) {
            System.out.println("Sinema");
            
        } else if (15 <= sicaklik && sicaklik < 25) {
            System.out.println("Piknik");
        } else {
            System.out.println("Yüzme");
        }
    }
}
