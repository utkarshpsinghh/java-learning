package day05;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.pow(2,2));
        System.out.println(Math.round(3.14));
        System.out.println(Math.ceil(3.13));
        System.out.println(Math.floor(3.13));
        System.out.println(Math.sqrt(4));







        Scanner sr = new Scanner(System.in);
        System.out.print("First Number : ");
        double a = sr.nextDouble();
        System.out.print("Second Number : ");
        double b = sr.nextDouble();

        double result;
        result = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.printf("Hypotenuse equals %.1f",result);


        sr.close();





    }
}