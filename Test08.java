import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        int grade = 9 ;
        String space = " " ;

        while (grade >=0) {  
            System.out.printf("%d %n" ,grade);
            grade = grade - 1;
            System.out.printf(space);
            space = space + " ";
           
           
        }
    }
}
