import java.util.*;
public class EvenOdd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of testcases you wanna check");
        int TestCase = sc.nextInt();
        for(int i = 0;i<TestCase;i++){
            System.out.println("Enter a number");
            int Number = sc.nextInt();
            if(Number%2 == 0){
                System.out.println(Number+" is an even number");
            }
            else{
                System.out.println(Number+" is an odd number");
            }
        }
        sc.close();
    }
}
