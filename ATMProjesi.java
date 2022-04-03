import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int balance=2000;
        int access=3;
        int choose;
        int deposit;
        while(0<access){
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            password = input.nextLine();
            if(userName.equals("patikadev") && password.equals("123")) {
                System.out.println("\nBankamıza Hoşgeldiniz !");
                System.out.println("Yapacağınız işlemin kodunuz giriniz");
                System.out.println("1-Para yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye Sorgula\n" +
                                    "4-Çıkış Yap");
                choose = input.nextInt();
                if(choose==1){
                    System.out.println("Mevcut Bakiyeniz : "+balance);
                    System.out.print("Yatıracağınız bakiyeyi giriniz : ");
                    deposit = input.nextInt();
                    balance+=deposit;
                    System.out.println("Güncel Bakiyeniz : "+balance);
                    access=0;
                }else if(choose==2){
                    System.out.println("\nMevcut Bakiyeniz : "+balance);
                    System.out.print("Çekeceğiniz bakiyeyi giriniz : ");
                    deposit = input.nextInt();
                    balance-=deposit;
                    System.out.println("Güncel Bakiyeniz : "+balance);
                    access=0;

                }else if(choose==3){
                    System.out.println("Bakiyeniz : " + balance);
                    access=0;
                }else if(choose==4){
                    System.out.println("Çıkış Yapılıyor...");
                    access=0;
                }
            }else{
                access-=1;
                System.out.println("\nKullanıcı adınız veya şifreniz yanlış ! \nKalan deneme hakkınız : "+access);
                if (access==0){
                    System.out.println("Hesabınız Bloke Olmuştur!");
                }

            }
        }
    }
}
