import java.util.*;
public class ReverseArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int Size = sc.nextInt();
        int [] arr = new int[Size];
        System.out.println("Enter the elements of the array: ");
        for(int i =0;i<Size;i++){
            int val = sc.nextInt();
            arr[i] = val;
        }
        for(int i = Size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
