import java.util.*; 
public class PrintingNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get list of numbers upto that number");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
