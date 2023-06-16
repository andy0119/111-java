import java.util.Arrays;

public class test2 {
    public void run() {
        int[] arr1 = { 1, 2, 3};
        int[] arr2 = arr1;
        
        arr2[0] = 100;

        for (int e : arr1)
            System.out.println("arr1 = " + e);
    }
}
