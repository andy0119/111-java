package test;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		
	}
	public Time(int hour) {
		this.(hour,0 );
	}
	public Time(int hour,int minute) {
		this.(hour ,minute,0);
	}
	public Time(int hour,int minute,int second) {
		setTime(hour ,minute,second);
	}
	
	public void setHour(int hour) {
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour was out of range");
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute was out of range");
		this.minute = minute;
	}
	
	public void setSecond(int second) {
		if(hour < 0 || second >= 60)
			throw new IllegalArgumentException("second was out of range");
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}
	public void setTime(Time time) {
		this.setTime(time.getHour(), time.getminute(),time.getsecond());
	}
	public int getHour() {
	    return hour;
	}

	public int getMinute() {
	    return minute;
	}

	public int getSecond() {
	    return second;
	}

}
