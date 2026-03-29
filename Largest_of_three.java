import java.util.*;
public class Largest_of_three {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int TestCase = sc.nextInt();
        while(TestCase>0){
            System.out.println("Enter value of A:");
            int A = sc.nextInt();
            System.out.println("Enter value of B:");
            int B = sc.nextInt();
            System.out.println("Enter value of C:");
            int C = sc.nextInt();
            if(A>B && A>C){
                System.out.println(A+" is greater among three numbers");
            }
            else if(B>C){
                System.out.println(B+" is greater among three numbers");
            }
            else{
                System.out.println(C+" is greater among three numbers");
            }
            TestCase--;
        } 
        sc.close();
    }
}
