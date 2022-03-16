public class SwitchCaseYapisi {
    public static void main (String[] args){
        int a;
        a=10;
        switch (a){     //swith'in içerisine değerini karşılaştıracağımız değişkeni yazıyoruz
            case 5:     // değişkenin eşit olup olmadığı değeri case olarak yazıp : ifadesiyle tamamlıyoruz
                System.out.println("a'nın değeri 5");   // sout yazdırıp ya da işlem yaptırıp ; ile bitiriyoruz
                break;      // break ile bitiriyoruz. bitirmezsek şart sağlanan case'in altındaki tüm komutlar yine de çalışır
            case 10:        // yani a 5 olsaydı ve breaklar olmasaydı hepsini yazdırırdır
                System.out.println("a'nın değeri 10");
                break;
            case 15:
                System.out.println("a'nın değeri 15");
                break;
            case 20:
                System.out.println("a'nın değeri 20");
                break;
            default:
                System.out.println("Şartlardan hiçbiri sağlanmazsa bu çalışır");
                break;
        }

    }
}
