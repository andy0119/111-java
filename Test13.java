public class Test13 {
    public static void main(String[] args) {
        int row = 0;
        int blank = 4;
        int star = 0;
        int col;
        while (row < 9){
            col = 0;
            while(col < blank){
                System.out.print(" ");
                col += 1 ;
            }

        col = 0;
        while (col <= star){
            System.out.print("*");
            col += 1;
        }

        System.out.print("\n");
        
        if (row < 4){
            blank -= 1;
            star += 2;
        }
        else {
            blank += 1;
            star -= 2;
        }
        row = row +1 ;      
        }
    }
}
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *