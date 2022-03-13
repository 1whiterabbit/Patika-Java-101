import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double armut,elma,domates,muz,patlican,total;
        System.out.print("Armut Kaç Kilo ? : ");
        armut = (input.nextDouble())*2.14;
        System.out.print("Elma Kaç Kilo ? : ");
        elma = (input.nextDouble())*3.67;
        System.out.print("Domates Kaç Kilo ? : ");
        domates = (input.nextDouble())*1.11;
        System.out.print("Muz Kaç Kilo ? : ");
        muz = (input.nextDouble())*0.95;
        System.out.print("Patlican Kaç Kilo ? : ");
        patlican = (input.nextDouble())*5.0;
        total = armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutar : " + total +" tl");
        }
    }