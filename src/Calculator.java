import java.util.Scanner;
public class Calculator {
   
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        

        System.out.print(
        "Welcome to Java Console Calculator:\n\n" +
        "Select an operation:\n" +
        "1. addition\n" +
        "2. Subtraction\n" +
        "3. Multiplication\n" +
        "4. Division\n" 
        );

        System.out.print("Enter choice(1-Add,2-sub,3-multi,4-div) : ");
         int choice = sc.nextInt();


        System.out.println("Enter a first Number: ");
        int num1 = sc.nextInt();
         System.out.println("Enter a Second Number: ");
         int num2 = sc.nextInt();
         
         
         double result;
         switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case 4:
            if (num2 != 0) {
            result = (double) num1 / num2;
            System.out.print("Result = " + result);
            }
            else {
                System.out.println("Error:Division by zero  is not allowed");
            }
            break;
            default:
                System.out.println("Invalid choice");
         }
         sc.close();

    }
}
    

    