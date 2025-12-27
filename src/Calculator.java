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
        "4. Division\n" +
        "5. Modulus\n" +
        "6. power\n" +
        "7. Sqaure\n" +
        "8. Cube\n"+
        "9. factorial\n"
        );

        System.out.print("Enter choice(1-Add,2-sub,3-multi,4-div,5-modulus,6-power,7-Square,8-cube,9-fact) : ");
         int choice = sc.nextInt();


         double result;
         switch (choice) {
            case 1:
                 System.out.print("Enter first number: ");
        int a1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int b1 = sc.nextInt();
                result = a1 + b1;
                System.out.println("Result = " + result);
                break;

            case 2:
                 System.out.print("Enter first number: ");
        int a2 = sc.nextInt();
        System.out.print("Enter second number: ");
        int b2 = sc.nextInt();
                result = a2 - b2;
                System.out.println("Result = " + result);
                break;

            case 3:
                 System.out.print("Enter first number: ");
        int a3 = sc.nextInt();
        System.out.print("Enter second number: ");
        int b3 = sc.nextInt();
                result = a3 * b3;
                System.out.println("Result = " + result);
                break;

            case 4:
                 System.out.print("Enter first number: ");
        int a4 = sc.nextInt();
        System.out.print("Enter second number: ");
        int b4 = sc.nextInt();
            if (b4 != 0) {
            result = (double) a4 / b4;
            System.out.print("Result = " + result);
            }
            else {
                System.out.println("Error:Division by zero  is not allowed");
            }
            break;
            case 5:
                 System.out.print("Enter first number: ");
        int a5 = sc.nextInt();
        System.out.print("Enter second number: ");
        int b5 = sc.nextInt();
                if(b5 !=0){
                    result = a5 % b5;
                      System.out.print("Result = " + result);

                }
                else {
                    
                System.out.println("Error:Division by zero  is not allowed");
            
                }
                break;
                case 6:
                     System.out.print("Enter first number: ");
        int a6 = sc.nextInt();
        System.out.print("Enter second number: ");
        int b6 = sc.nextInt();
                    result = Math.pow(a6, b6);
                    System.out.print("Result = " + result);

            break;
            case 7:
                 System.out.print("Enter first number: ");
        int a7 = sc.nextInt();
       
                result = Math.pow(a7, 2);
                System.out.print("Result = " + result);
                break;
                case 8:
                     System.out.print("Enter first number: ");
        int a8 = sc.nextInt();
        
                    result = Math.pow(a8, 3);
                     System.out.print("Result = " + result);
                     break;
                case 9:
                    System.out.print("Enter  number: ");
        int num = sc.nextInt();
        
                   
                    int fact = 1;
                    for(int i = 1;i <= num;i++){
                     fact = fact * i;
                    }
                     System.out.println("Result = " + fact);
                     break;

            default:
                System.out.println("Invalid choice");
         }
         sc.close();

    }
}
    

    