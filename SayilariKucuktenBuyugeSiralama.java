import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,z;
        System.out.print("Birinci Sayıyı Giriniz (x) : ");
        x = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz (y) : ");
        y = input.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz (z) : ");
        z = input.nextInt();

        if (y<x && z<x){
            if (z<y){
                System.out.println("x>y>z");
            } else if(z==y){
                System.out.println("x>y=z");
            } else {
                System.out.println("x>z>y");
            }
        } else if (x<y && z<y){
            if (z<x){
                System.out.println("y>x>z");
            } else if(x==z){
                System.out.println("y>x=z");
            } else {
                System.out.println("y>z>x");
            }
        } else{
            if(y<x){
                System.out.println("z>x>y");
            } else{
                System.out.println("z>y>x");
            }
        }
    }
}