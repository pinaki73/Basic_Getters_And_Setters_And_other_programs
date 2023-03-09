import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = sc.nextDouble();
        System.out.println("Enter the second number");
        double b = sc.nextDouble();
        System.out.println("Enter a choice \n 1) Addition \n 2) Substraction \n 3) multiplication \n 4) quotient \n 5) reminder");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                double add = a + b;
                System.out.println("the addition is " + add);
                break;
            case 2:
            double sub = a - b;
            System.out.println("the substraction is " +sub);
            break;
            case 3:
            double mul = a * b;
            System.out.println("the multiplication is " +mul);
            break;
            case 4:
            double quo = a / b;
            System.out.println("the quotiont is " +quo);
            break;
            case 5:
            double rem = a % b;
            System.out.println("the reminder is " +rem);
            break;
            default:
            System.out.println("This input is invalid");
        }
    }
}