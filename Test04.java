import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        int grade;
                
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        grade = input.nextInt();
        
        if (grade >= 60 & grade <=70){
                System.out.println("<=70");
        }
            else{ 
                System.out.println("<60");
        }
    }
}
