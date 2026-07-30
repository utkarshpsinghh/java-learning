public class Main {
    public static void main (String[] args) {

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 999;

        if (isStudent) {
            System.out.println("You get 10% Discount");
            price = price * 0.9;
            if (isSenior) {
                System.out.println("You get 30% off");
                price = price * 0.7;
            }
        } else if (isSenior){
            System.out.println("You get 20% off");
        }
        else {
            System.out.println("No Discount");
        }

    }
}