public class Test27{
    public static void main(String[] args) {
        int[]myArr ={7, 5, 4, 8, 1, 2};
        int temp;
        for(int i = 0; i < myArr.length / 2; i++){
            temp = myArr[i];
            myArr[i] = myArr[myArr.length - i - 1];
            myArr[myArr.length - i - 1] = temp;
        }
        for (int i=0; i<myArr.length; i++){
            System.out.println(myArr[i]);
        }
    }
}   