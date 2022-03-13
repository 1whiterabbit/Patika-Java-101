import java.util.Scanner;

public class DaireAlaniveCevresi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yaricap,aci,pi=3.14,cevre,alan,diliminAlani;
        System.out.print("Dairenin Yarıçapını Giriniz : ");
        yaricap = input.nextInt();
        System.out.print("Dilimin Merkez Açısını Giriniz : ");
        aci = input.nextInt();
        cevre = 2*pi*yaricap;
        alan = pi*yaricap*yaricap;
        diliminAlani = (pi*yaricap*yaricap*aci)/360;
        System.out.println("Dairenin Çevresi : " +cevre);
        System.out.println("Dairenin Alanı : " +alan);
        System.out.println("Dilimin Alanı : " +diliminAlani);
    }
}