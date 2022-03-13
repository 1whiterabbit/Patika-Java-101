import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gidilecekMesafe, minTutar=20, acilisUcreti=10;
        double kmBasina=2.20, odenecekTutar, indibindi;

        System.out.print("Gidilecek Mesafeyi Km Cinsinden Giriniz : ");
        gidilecekMesafe = input.nextInt();

        odenecekTutar = acilisUcreti+gidilecekMesafe*kmBasina;
        indibindi = (odenecekTutar<minTutar) ? minTutar : odenecekTutar;
        System.out.print("Ödeyeceğiniz Tutar : " +indibindi + " tl");

    }
}