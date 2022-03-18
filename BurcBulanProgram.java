import java.util.Scanner;

public class BurcBulanProgram {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int day,month;
        System.out.print("Doğduğunuz Ayı Giriniz : ");
        month= input.nextInt();
        System.out.print("Doğduğunuz Günü Giriniz : ");
        day= input.nextInt();
        if(month == 1){
            if(0<day && day < 22){
                System.out.println("Oğlak Burcu");
            }
            else{
                System.out.println("Kova Burcu");
            }
        }
        else if(month == 2){
            if(0<day && day < 20){
                System.out.println("Kova Burcu");
            }
            else{
                System.out.println("Balık Burcu");
            }
        }
        else if(month == 3){
            if(0<day && day < 20){
                System.out.println("Balık Burcu");
            }
            else{
                System.out.println("Koç Burcu");
            }
        }
        else if(month == 4){
            if(0<day && day < 20){
                System.out.println("Koç Burcu");
            }
            else{
                System.out.println("Boğa Burcu");
            }
        }
        else if(month == 5){
            if(0<day && day < 21){
                System.out.println("Boğa Burcu");
            }
            else{
                System.out.println("İkizler Burcu");
            }
        }
        else if(month == 6){
            if(0<day && day < 22){
                System.out.println("İkizler Burcu");
            }
            else{
                System.out.println("Yengeç Burcu");
            }
        }
        else if(month == 7){
            if(0<day && day < 23){
                System.out.println("Yengeç Burcu");
            }
            else{
                System.out.println("Aslan Burcu");
            }
        }
        else if(month == 8){
            if(0<day && day < 23){
                System.out.println("Aslan Burcu");
            }
            else{
                System.out.println("Başak Burcu");
            }
        }
        else if(month == 9){
            if(0<day && day < 23){
                System.out.println("Başak Burcu");
            }
            else{
                System.out.println("Terazi Burcu");
            }
        }
        else if(month == 10){
            if(0<day && day < 23){
                System.out.println("Terazi Burcu");
            }
            else{
                System.out.println("Akrep Burcu");
            }
        }
        else if(month ==11){
            if(0<day && day < 22){
                System.out.println("Akrep Burcu");
            }
            else{
                System.out.println("Yay Burcu");
            }
        }
        else if(month == 12){
            if(0<day && day < 22){
                System.out.println("Yay Burcu");
            }
            else{
                System.out.println("Oğlak Burcu");
            }
        }
    }
}
