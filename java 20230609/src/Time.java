
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
    }

    public Time(int hour) {
        this(hour, 0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour was out of range");
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (hour < 0 || hour >= 60)
            throw new IllegalArgumentException("hour was out of range");
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (hour < 0 || hour >= 60)
            throw new IllegalArgumentException("hour was out of range");
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }
    
    public void setTime(Time time) {
        this.setTime(time.getHour(), time.getMinute(), time.getSecond());
    }

    public int getHour() {
        return this.hour;
    }
    
    public int getMinute() {
        return this.minute;
    }
    
    public int getSecond() {
        return this.second;
    }

    public String toString() {
        int hour12 = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String ampmStr = hour < 12 ? "AM" : "PM";
        return String.format("%02d-%02d-%02d %s", hour12, minute, second, ampmStr);
    }

    public String toUniversalString() {
        return String.format("%02d-%02d-%02d", hour, minute, second);
    }
    
    public String toUniversalString(Zone zone) {
        if (zone == Zone.TW)
            return String.format("%02d-%02d-%02d", hour, minute, second);
        if (zone == Zone.US)
            return String.format("%02d-%02d-%02d", hour, minute, second);
        
        return null;
    }
}
