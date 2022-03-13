import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kenar1,kenar2,kenar3,cevre;
        System.out.print("1. Kenar Uzunluğunu Giriniz : ");
        kenar1 = input.nextInt();
        System.out.print("2. Kenar Uzunluğunu Giriniz : ");
        kenar2 = input.nextInt();
        System.out.print("3. Kenar Uzunluğunu Giriniz : ");
        kenar3 = input.nextInt();
        double alan,u;
        cevre = kenar1 + kenar2 + kenar3;
        System.out.println("Üçgenin Çevresi : " +cevre);
        u = cevre/2;
        alan = Math.sqrt((u * (u-kenar1) * (u-kenar2) * (u-kenar3)));
        System.out.println("Üçgenin Alanı : " +alan);
    }
}