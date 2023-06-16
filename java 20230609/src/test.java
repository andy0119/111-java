import ch8_9.Book;

public class test {
    public static void main(String[] args) {
        TimeSon time1 = new TimeSon();
        TimeSon time2 = new TimeSon();
        
        time1.setTime(time2);
        
        try {
            time1.setHour(10);
            time1.setMinute(19);
            time1.setSecond(25);
            time1.setTime(10, 47, 26);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        String uniTime = time1.toUniversalString();
        uniTime = time1.toUniversalString(Zone.TW);
        System.out.println("time1.setTime = " + uniTime);
        System.out.println("time1.getHour = " + time1.getHour());
        System.out.println("time1.getHour = " + time1.getMinute());
        System.out.println("time1.getHour = " + time1.getSecond());
        
        System.out.println("======= ");        
        System.out.println(time1.getHourMinuteSecond());
    }
}
