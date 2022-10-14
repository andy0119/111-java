public class Test12 {
    public static void main(String[] args) {
        int row = 0 ;
        String star = "*";

        while (row < 5) {
            int b = 4 - row ;
            while (b > 0) {
                System.out.print(" ");
                b = b - 1 ;
            }            
            System.out.println(star);
            star = star + "**";
            row = row + 1 ;
        }
    }
}
//    *
//   ***
//  *****
// *******
//*********