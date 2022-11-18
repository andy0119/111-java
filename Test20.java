public class Test20 {
    public static void main(String[] args) {
        int a;
        int k = 7;

        System.out.printf("%d%n",k);

        Test22 t21 = new Test22();
        a = t21.add(k,4);
        System.out.printf("%d%n",a);
    }
}
class Test21 {
    public static int add(int x,int y){
       
        int t = x+y;
        return t;
    }
}
//Test20 Test21 Test22