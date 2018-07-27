
public class Complex {
	float real;
	float imaginary;

	public void set(float real, float imaginary) {// function for setting the input
		this.real = real;
		this.imaginary = imaginary;
	}

	public void disp() {// function for displaying the input
		System.out.println(+real + " +i" + imaginary);
	}

	static Complex sum(Complex complex1, Complex complex2) {// function for adding the complex number
		Complex complex3 = new Complex();

		complex3.real = complex1.real + complex2.real;
		complex3.imaginary = complex1.imaginary + complex2.imaginary;
		return complex3;
	}
}
