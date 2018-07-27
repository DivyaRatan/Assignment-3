
public class Distance {
	int feet;
	float inches;

	public void set(int feet, float inches) {// Function for taking the input
		this.feet = feet;
		this.inches = inches;
	}

	public void disp() {// function for displaying the input
		System.out.println(+feet + " feet" + inches + " inches");
	}

	static Distance sum(Distance distance1, Distance distance2) {// Adding the distances
		Distance distance = new Distance();

		distance.feet = distance1.feet + distance2.feet;
		distance.inches = distance1.inches + distance2.inches;
		return distance;
	}
}
