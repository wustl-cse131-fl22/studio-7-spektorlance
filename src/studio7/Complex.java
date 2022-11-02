package studio7;

public class Complex {
	private double a;
	private double b;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	//Getters
	public double geta() {
		return this.a;
	} 
	public double getb() {
		return this.b;
	}
	
	//Setters
	public void seta(double a) {
		this.a = a;
	}
	public void setb(double b) {
		this.b = b;
	}
	
	//addition
	public Complex addComplex(Complex other) {
		double newa = this.a + other.a;
		double newb = this.b + other.b;
		Complex newComplex = new Complex(newa, newb);
		return newComplex;
		
	}
	
	public Complex multiComplex(Complex other) {
		double newa = this.a*other.a - this.b*other.b;
		double newb = this.a*other.b + this.b*other.a;
		Complex newComplex = new Complex(newa, newb);
		return newComplex;
	}
	
	public String toString(){
		return a + "+" + b + "i";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
