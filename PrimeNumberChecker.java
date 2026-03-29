import java.util.*;
public class PrimeNumberChecker {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number to check whether it is a prime number or not: ");
       int num = sc.nextInt();
       int flag = 0;
       if(num<=1){
            flag = 1;
       }
       for(int i = 2;i<=Math.sqrt(num);i++){
            if(num % i ==0){
                flag = 1;
                break;
            }
            else{
                flag = 0;
            }
       }
       if(flag == 0){
        System.out.println("The given number "+num +" is a prime number");
       }
       else{
        System.out.println("The given number "+num +" is not a prime number");
       }
       sc.close();
    }
    
}
