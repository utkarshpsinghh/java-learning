import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sr = new Scanner(System.in);
     System.out.print("First Number : ");
     double first_number = sr.nextDouble();
     System.out.print("Second Number : ");
     double second_number = sr.nextDouble();
     System.out.print("Operator (+, -, /, *) : ");
     char operator = sr.next().charAt(0);


     if (operator == '+') {
         System.out.println(first_number+second_number);
     } else if (operator == '-') {
         System.out.println(first_number-second_number);
     } else if (operator == '*') {
         System.out.println(first_number*second_number);
     } else if (operator == '/') {
         if (second_number==0 || first_number==0) {
             System.out.println("Division with 0 is not possible");
         } else {
             System.out.println(first_number/second_number);

         }
     }

        sr.close();

    }
}