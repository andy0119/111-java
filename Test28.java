public class Test28{
    public static void main(String[]args) {
        int[]myArr = {7, 5, 4, 9, 8, 1, 2};
        int[]flag = new int[myArr.length];
        int max = 0;
        int min = 10;
        float avg = 0;
        int flag_count = 1;
        int a;

        for(int x=0; x<myArr.length ; x++){
            if(myArr[x] > max){
                max = myArr[x];
            }
            if(myArr[x] < min){
                min = myArr[x];
            }
            a = myArr[x];
            avg = a + avg;
        }
        int med = 0;
        for (int i=0; i<4; i++){
            int flag_min = 1000;
            int flag_min_index = 0;
            for (int j=0; j<myArr.length; j++){
                if(myArr[j]<flag_min && flag[j] == 0){
                    flag_min = myArr[j];
                    flag_min_index = j;
                }
            }
            flag[flag_min_index] = flag_count;
            flag_count++;
            med = myArr[flag_min_index];
        }
        System.out.println("max: " + max); //最大值
        System.out.println("min: " + min); //最小值
        System.out.println("avg: " + avg/7); //平均值
        System.out.println("med: " + med); //中位數
    }
}