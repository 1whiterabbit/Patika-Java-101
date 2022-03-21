import java.util.Scanner;

public class TamBoluneniBulanProgram {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
