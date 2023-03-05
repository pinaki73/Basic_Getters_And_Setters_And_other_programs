import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value to check attendende");
        int input = sc.nextInt();
        if (input == 1)
        {
            System.out.println("employee is present");
        }
        else{
            System.out.println("employee is absent");
        }


    }
}