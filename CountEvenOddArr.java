import java.util.*;
public class CountEvenOddArr {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int Size = sc.nextInt();
        int [] arr = new int[Size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<Size;i++){
            int val = sc.nextInt();
            arr[i] = val;
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int i =0;i<Size;i++){
            if(arr[i]%2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("The even count is: "+evenCount);
        System.out.println("The odd count is: "+oddCount);
        sc.close();
    }
}
