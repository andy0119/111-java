import java.util.Scanner;
public class Test29{
    public static void main(String[]args) {
        int [] arr = {10, 9, 8, 2, 6, 5, 4, 3, 2, 1, 0,};
        int target = 2; //find 2 
        int targetIndex = 0; //reset 0
        int count = 0; //zero
        
        for(int i=1; i<arr.length; i++){
            count ++;
            if (arr[i] == target){
                targetIndex = i;
                break;
            }
        }
        System.out.println("The position is " + targetIndex);
        System.out.println("count:"+count);
    }
}