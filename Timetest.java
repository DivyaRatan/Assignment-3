
public class Timetest {
	public static void main(String args[]) {
		Time t1 = new Time();
		Time t2 = new Time();
		// Taking the input
		t1.setTime(10, 15);
		t2.setTime(8, 45);
		// Displaying the input
		t1.showTime();
		t2.showTime();

		Time t3 = new Time();
		t3 = Time.Sum(t1, t2);// Calling the function

		System.out.println("Total Time:");
		System.out.println("Total hours " + t3.hours + " Total minutes " + t3.minute);
	}
}
