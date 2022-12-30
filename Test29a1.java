import java.util.Scanner;
public class Test29a1{
    public static void main(String[]args) {
        int [] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0,};
        int left = 0;
        int right = arr.length-1;
        int target = 2; //find 2 
        int medianIndex;
        int targetIndex = 0; //reset 0
        int count = 0; //zero
        
        for(int i=0; i<3; i++){
            count ++;
            medianIndex = (right-left)/2+left;
            if (arr[medianIndex] == target){
                targetIndex = medianIndex;
                break;
            }
            if (target > arr[medianIndex]) 
                right = medianIndex;
            else 
                left =  medianIndex;
                System.out.printf("%d %d %d\n", right, left, medianIndex);
        } 

        System.out.println("The position is " + targetIndex);
        System.out.println("count:"+count);
    }
}