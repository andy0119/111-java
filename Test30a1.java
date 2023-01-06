public class Test30a1{
    public static void main(String[]args){
    int x = 10;
    int y = x;
    y = 20;
    System.out.println("setVariable:x" + x);
    System.out.println("setVariable:y" + y);


    int []arr = {1,2,3,4,5};
    int []arr2 = arr;
    arr2[0] = 10;
    System.out.println("arr[0]" + arr[0]);
    System.out.println("arr2[0]" + arr2[0]);
    }
}
//Test30 and Test30a1 together 