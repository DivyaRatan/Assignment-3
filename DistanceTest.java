import java.util.Scanner;

public class DistanceTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first feet");
		int feet1 = scanner.nextInt();
		System.out.println("Enter the first inch");
		int inch1 = scanner.nextInt();
		Distance distance1 = new Distance();

		distance1.set(feet1, inch1);// Taking the input

		System.out.println("Enter the second feet");
		int feet2 = scanner.nextInt();
		System.out.println("Enter the second inch");
		int inch2 = scanner.nextInt();
		Distance distance2 = new Distance();

		distance2.set(feet2, inch2);
		Distance distancesum = new Distance();
		distancesum = Distance.sum(distance1, distance2);// Calling the sum function by the object of Distance
		System.out.println("New Distance is " + distancesum.feet + " feet " + distancesum.inches + " inch");

	}
}