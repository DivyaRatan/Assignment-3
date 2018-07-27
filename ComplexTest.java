import java.util.Scanner;
public class ComplexTest {
	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);

	    System.out.println("Enter the first real number");
		int real1=scanner.nextInt();
	    System.out.println("Enter the first imaginary number");
		int imaginary1=scanner.nextInt();
		Complex complex1=new Complex();
		
		complex1.set(real1,imaginary1);//Setting the input
		
		System.out.println("Enter the second real number");
	    int real2=scanner.nextInt();
	    System.out.println("Enter the second imaginary number");
		int imaginary2=scanner.nextInt();
		Complex complex2=new Complex();
		
		complex2.set(real2,imaginary2);//Calling the Complex by its object
		
		Complex complexsum=new Complex();
		complexsum=Complex.sum(complex1, complex2);
		System.out.println("New complex Number is " +complexsum.real + " +" +complexsum.imaginary);
		
		
		
	}		
}
