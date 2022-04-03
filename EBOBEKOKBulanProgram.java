import java.util.Scanner;

public class EBOBEKOKBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        int n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int n2 = input.nextInt();
        int limit;

        if (n2<=n1) {
            limit = n2;
        }else {
            limit = n1;
        }
        for (int i=limit;1<=i;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println("EBOB = " +i);
                break;
            }
        }
        for (int i=2;i<=(n1*n2);i++){
            if(i%n1==0 && i%n2==0){
                System.out.println("EKOK = " +i);
                break;
            }
        }
    }
}
