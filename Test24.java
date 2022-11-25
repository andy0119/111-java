import java.util.Scanner;
public class Test24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your km:");

        int a = input.nextInt();
            System.out.println("total price:");
            if(a > 7){
                System.out.println(  ( 85+ (a-7) * 5 )  );
            }
            else
                System.out.println("85");  
    }
}
