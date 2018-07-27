
public class Time {
	int hours;
	int minute;
	public void setTime(int hours,int minute) {//Function for setting the input
		this.hours=hours;
		this.minute=minute;
	}
	public void showTime() {//function for displaying the input
		System.out.println(hours+ " is hour " +minute + " is minute");
		
	}
	static Time Sum(Time t1,Time t2) {//Function for adding the two distance
		Time t=new Time();
		
		t.hours=t1.hours+t2.hours;
		t.minute=t1.minute+t2.minute;
		if(t.minute>=60) {
			t.minute-=60;
			t.hours++;
		}
		return t;
	}

}
