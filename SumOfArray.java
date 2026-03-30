import java.util.*;
public class SumOfArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int [] arr = new int [Size];
        for(int i = 0;i<Size;i++){
            int Value = sc.nextInt();
            arr[i] = Value;
        }
        int Sum = 0;
        for(int i = 0;i<Size;i++){
            Sum += arr[i];
        }
        System.out.println(Sum);
        sc.close();
    }
}
