public class Test26 {
    public static void main(String[] args){
        int[]arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int count = 0;
        int temp;

        for(int x= 0; x<=arr.length;x++){
            count++;
            if(arr[x]==5){ //find 5
                System.out.println(">>"+x);
                break;
            }
            System.out.println("counts:"+count); //find次數
        }
    }
}
