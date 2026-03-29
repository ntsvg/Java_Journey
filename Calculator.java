import java.util.*;
public class Calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int A = sc.nextInt();
        System.out.println("Enter another number");
        int B = sc.nextInt();
        System.out.println("Enter ur choice");
        String choice = sc.next();
        switch(choice){
            case "+":
                System.out.println(A + B);
                break;
            case "-":
                System.out.println(A - B);
                break;
            case "*":
                System.out.println(A * B);
                break;
            case "/":
                if(B !=0){
                    System.out.println(A/B);
                    break;
                }
                else{
                    System.out.println("Can you choose B value other than 0");
                    break;
                }
            default:
                System.out.println("It is an invalid option! try again...");
        }
        sc.close();
    }
}
