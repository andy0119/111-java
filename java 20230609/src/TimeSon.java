
public class TimeSon extends Time {
    public String getHourMinuteSecond() {
        int h = super.getHour();
        int m = super.getMinute();
        int s = super.getSecond();
        
        return h + "--" + m + "--" + s;
    }
}
