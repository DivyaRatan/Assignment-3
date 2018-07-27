
public class Rectangle {
	private int length, breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	int area() {//Function for finding area
	int area=length*breadth;
	return area;
	}
	int perimeter() {//function for finding perimeter
		int perimeter=2*(length+breadth);
		return perimeter;
		}
	

}
