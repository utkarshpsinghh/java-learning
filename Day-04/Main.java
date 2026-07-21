import  java.util.Random;
public class Main{
    public static void main(String[] args) {
        Random rn = new Random();

        int number;
        boolean isHead;
        double number1;

        number = rn.nextInt(1, 7);
        System.out.println(number);
        number1 = rn.nextDouble(1, 7);
        System.out.println(number1);


        isHead = rn.nextBoolean();

        if (isHead) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");

        }

    }
}