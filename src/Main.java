import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = sc.nextDouble();
        System.out.println("Enter the first number");
        double b = sc.nextDouble();
        System.out.println("Enter a choice \n 1) Addition \n 2) Substraction \n 3) multiplication \n 4) quotient \n 5) reminder");
        int choice = sc.nextInt();
        if (choice == 1) {
            double add = a + b;
            System.out.println("the addition is " + add);
        }else if (choice == 2){
            double sub = a - b;
            System.out.println("the substraction is " +sub);
        }else if (choice == 3){
            double mul = a * b;
            System.out.println("the multiplication is " +mul);
        }else if (choice == 4){
            double quo = a / b;
            System.out.println("the quotiont is " +quo);
        }else if (choice == 5){
            double rem = a % b;
            System.out.println("the reminder is " +rem);
        }
        else{
            System.out.println("This input is invalid");
        }
    }
}





