import java.util.Scanner;

public class MinveMaxDegerleriBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gireceğiniz Sayı Adetini Yazınız : ");
        int n = input.nextInt();
        int x=0;
        int y;
        int z=99999;
        for (int i=1;i<=n;i++){
            System.out.print(i + ". Sayıyı Giriniz : ");
            y = input.nextInt();
            if (x<y){
                x=y;
            }
            if (y<z){
                z=y;
            }
        }
        System.out.println("En Büyük Sayı : "+x);
        System.out.println("En Küçük Sayı : "+z);

    }
}
