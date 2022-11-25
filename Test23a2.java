public class Test23a2 {
    public static void main(String[] args) {
        for (int i=-4 ; i <= 4 ; i++){
            for (int k= -5 ;k <= 5 ; k++){
                if (Math.abs(k) + Math.abs(i) > 4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
/*
***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****
 */