import java.util.Scanner;

public class MukemmelSayiBulanProgram {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();
        int sayac=0;
        for (int i=1;i<n;i++){
            if(n%i==0){
                sayac+=i;
            }
        }
        if(n==sayac){
            System.out.println(n+" Mükemmel Sayıdır!");
        } else{
            System.out.println(n+" Mükemmel Sayı Değildir!");
        }
    }
}
