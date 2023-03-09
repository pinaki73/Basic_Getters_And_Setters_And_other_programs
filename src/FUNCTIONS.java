import java.util.Scanner;

public class FUNCTIONS {
     public static void addition(double a, double b){
    double add = a + b;
         System.out.println("the adiition is "+add);
     }
     public static void subtraction(double a, double b){
         double sub = a - b;
         System.out.println("The subtraction is  " + sub);
     }
    public static void division(double a, double b){
        double div = a / b;
        System.out.println("The division is  " + div);
    }
    public static void remainder(double a, double b){
        double mod = a % b;
        System.out.println("The remainder is  " + mod);
    }
     public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int cont =10;
                do {
                    System.out.println("Enter the first number");
                    double a = sc.nextDouble();
                    System.out.println("Enter the Second number");
                    double b = sc.nextDouble();
                    System.out.println("Enter your choice \n 1) Addition \n 2) Subtraction \n 3) Multiplication \n 4) Division \n 5) Remainder");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                           addition(a,b);
                            break;
                        case 2:
                           subtraction(a,b);
                            break;
                        case 3:
                            division(a,b);
                            break;
                        case 4:
                           remainder(a,b);
                            break;
                        default:
                            System.out.println("Wrong Choice");
                            break;
                    }
                    System.out.println("Enter 1 to continue");
                    cont = sc.nextInt();
                }while(cont == 1);
            }
        }



