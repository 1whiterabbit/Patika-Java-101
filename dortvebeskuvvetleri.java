import java.util.Scanner;

public class dortvebeskuvvetleri {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("4 ve 5'in kaçıncı kuvvetine kadar alınacağını giriniz : ");
        int n= input.nextInt();
        int x=1,y=1;

        for (int i=1;i<=n;i++){
            x*=4;
            y*=5;
            System.out.println("4'ün "+i+". kuvveti = "+x);
            System.out.println("5'in "+i+". kuvveti = "+y);
        }
    }
}
