import java.util.Scanner;

public class AsalSayilariYazdirma {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();
        for (int i=2;i<sayi;i++){
            int sayac = 0;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    sayac+=1;
                }
            }
            if (sayac==0){
                System.out.print(i+" ");
            }
        }


    }
}
