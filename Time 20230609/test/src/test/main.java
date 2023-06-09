package test;

public class main {
    public static void main(String[] args) {
        Time time1 = new Time();  // 创建一个默认时间对象
        Time time2 = new Time(10);  // 创建一个小时为10的时间对象
        Time time3 = new Time(12, 30);  // 创建一个小时为12，分钟为30的时间对象
        Time time4 = new Time(15, 45, 30);  // 创建一个小时为15，分钟为45，秒钟为30的时间对象
        

        System.out.println("Time 1: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println("Time 2: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        System.out.println("Time 3: " + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
        System.out.println("Time 4: " + time4.getHour() + ":" + time4.getMinute() + ":" + time4.getSecond());
    }
}
