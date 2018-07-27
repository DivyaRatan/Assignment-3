import java.util.Scanner;
public class RectangleTest {
	public static void main(String args[]) {
	Scanner scanner= new Scanner(System.in);
   //Taking input
    System.out.println("Enter the first length");
    int length=scanner.nextInt();
    System.out.println("Enter the first breadth");
	int breadth=scanner.nextInt();
	
	Rectangle rectangle=new Rectangle();
	
	rectangle.setLength(length);
	rectangle.setBreadth(breadth);
	 //Calling the function area
	int area=rectangle.area();
	System.out.println("Area is " +area);
	//Calling the function perimeter
	int perimeter=rectangle.perimeter();
	System.out.println("Perimeter is " +perimeter);
	
	System.out.println("Enter the second length");
    int length1=scanner.nextInt();
    System.out.println("Enter the second breadth");
	int breadth1=scanner.nextInt();
	//Checking that another rectangle is similar to previous one
	System.out.println("If there is another rectangle you want to check for simailarity with first one");
	String string=scanner.nextLine();
	if(string.equals("Yes")) {
    Rectangle rectangle1=new Rectangle();
	
	rectangle1.setLength(length1);
	rectangle1.setBreadth(breadth1);
	int area1=rectangle1.area();
	System.out.println("Area is " +area1);
	
	int perimeter1=rectangle1.perimeter();
	System.out.println("Perimeter is " +perimeter1);

	
	if(area==area1) {
		System.out.println("Rectangles having same area");
	}
	}	
}
}
