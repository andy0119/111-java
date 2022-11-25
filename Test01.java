public class Test01 {
    public static void main(String[] args){
        int num = 1;
        printStr(num);
        num = 2;
        printStr(num);
        num =num+1;
        printStr(num);
        ++num;
        printStr(num);
        num++;
        printStr(num);
    }

    public static void printStr(int str ) {
        System.out.println(str);
    }
}
