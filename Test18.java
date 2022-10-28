public class Test18 {
    public static void main(String[] args) {
    for(int i=1; i<=6; i++){
     for (int k=6; k>=1;k-- ){
        if (i<k)
            System.out.print("*");
        else 
            System.out.print(i-k+1);
        }
        System.out.println(""); 
        }
    }
}
// use two forloop print 
// *****1
// ****12
// ***123
// **1234
// *12345
// 123456