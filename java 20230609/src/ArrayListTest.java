import java.util.ArrayList;

public class ArrayListTest {
    public void run() {
        ArrayList<Integer> arrList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrList2 = new ArrayList<Integer>();

        // 建立串列 1
        for (int i = 0; i < 10; i+=2) {
            arrList1.add(i);
            System.out.print(i);
        }

        System.out.print("\n ===================\n");

        // 建立串列 2
        for (int i = 1; i < 10; i+=2) {
            arrList2.add(i);
            System.out.print(i);
        }

        System.out.print("\n ===================\n");
        int index = 1;
        for (int i = 0; i < arrList2.size(); i++) {
            int element = arrList2.get(i);
            arrList1.add(index, element);
            index += 2;
        }

        for (Integer ele : arrList1)
            System.out.print(ele);
    }

}
