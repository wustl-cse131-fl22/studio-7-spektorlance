package studio7;

public class Fraction {
	private int num;
	private int den;
	
	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	// Getters
	public int getNum() {
		return this.num;
	}
	
	public int getDen() {
		return this.den;
	}
	
	// Setters
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setDen(int den) {
		this.den = den;
	}
	
	
	// Other methods
	public Fraction addFraction(Fraction other) {
		int newNum = this.num + other.num;
		int newDen = this.den + other.den;
		Fraction newFrac = new Fraction(newNum, newDen);
		return newFrac;
	}
	
	public Fraction multiplyFraction(Fraction other) {
		int newNum = this.num * other.num;
		int newDen = this.den * other.den;
		Fraction newFrac = new Fraction(newNum, newDen);
		return newFrac;
	}
	
	public Fraction reciprocal() {
		int newNum = this.den; 
		int newDen = this.num; 
		Fraction newFrac = new Fraction(newNum, newDen);
		return newFrac;
	}
	
	public Fraction simplify() {
		int newNum = this.num;
		int newDen = this.den;
		for(int i = 2; i <= 11; i++) {
			while(this.num % i == 0 && this.den % i == 0) {
				newNum /= i;
				newDen /= i;
			}
		}
		Fraction newFrac = new Fraction(newNum, newDen);
		return newFrac;
	}
	
	public String toString() {
		return "Numerator: " + this.num + "\n" + "Denominator: " + this.den;
	}
	
}
