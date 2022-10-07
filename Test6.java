import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int grade;
                
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        grade = input.nextInt(); 

        if (grade >=101) {
            System.out.println("re enter the number");
        }  
        else if (grade <=-1) {
            System.out.println("re enter the number");
        }   
        else{
        
        switch (grade / 10 * 10) {
        case 90:
        case 100:  
            System.out.println("A");
            break;
        case 80: 
            System.out.println("B");
            break;
        case 70: 
            System.out.println("C");
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
}