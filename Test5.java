import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int grade;
                
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        grade = input.nextInt();
        
        switch (grade / 10 * 10) {
            case 90:
            case 100:  
            System.out.println("A");
            break;
            case 80: 
            System.out.println("B");
            break;
            case 70: 
            System.out.println("c");
            break;
            case 60: 
            System.out.println("D");
            break;
            default:
            System.out.println("E");
            break;
        }           
    }
}