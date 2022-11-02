package studio7;

public class Die {
	private int sides;
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public int getSides() {
		return this.sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public int diceRoll(){
		return (int)(Math.random() * this.sides) +1;
	}
	
	public String toString() {
		return ("Sides: "+this.sides);
	}
	
}
