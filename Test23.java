public class Test23 {
    public static void main(String[] args) {
        int a = 6;
        int b = 6;


        for (int i=0; i<=8 ; i++){
            for(int j=1; j<=11;j++){
                if (j >= a && j <= b)
                    System.out.printf(" ");
                else
                    System.out.printf("*");
            }
                if( i < 4 ){ 
                    a = a-1;
                    b = b+1;
                }
                else{
                    a = a+1;
                    b = b-1;
                }
                   
                    System.out.printf("\n");
            
              
                }
            }
        }
/*print 
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