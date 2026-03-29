import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = "";
        while(!input.equals("exit")){
            System.out.println("May I know Which number's multiplication table you want ?");
            int num = sc.nextInt();
            input = sc.next();
            for(int i =1;i<11;i++){
                System.out.println(+num +"*" + i +"="+num*i +"\n");
            }
            System.out.println("If you wanna exit kindly type exit otherwise press any key to continue except power button");
        }
        sc.close();
    }
}
