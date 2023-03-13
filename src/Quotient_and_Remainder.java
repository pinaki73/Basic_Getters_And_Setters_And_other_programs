import java.util.Scanner;

public class Quotient_and_Remainder {
    public static void main(String[] args) {
        int cont = 0;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        double a = sc.nextDouble();
        System.out.println("Enter the second no");
        double b = sc.nextDouble();
            double quo = a / b;
            double rem = a % b;
            System.out.println("The quotient is : " + quo);
            System.out.println("The remainder is : " + rem);
        cont =1;
        } while (cont == 1) ;

    }
}