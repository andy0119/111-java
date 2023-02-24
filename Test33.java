public class Test33{
    public static void main(String[]args){
        Human.printHight();
    }
}
class Human{
    int sex;
    static int heigth =100;
    private int weight =75;

    public static void printHight(){
        System.out.println(heigth);
    }
    private void printweight(){
        System.out.println(weight);
    }
}