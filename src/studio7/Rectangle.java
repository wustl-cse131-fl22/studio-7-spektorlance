package studio7;

public class Rectangle { 
	private int length;
	private int width;
	
	// Constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	// Getter methods:
	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}
	
	
	// Setter methods
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	// Calculation Methods
	public int calculateArea() {
		int area = this.length * this.width;
		return area;
	}
	
	public int calculatePerimeter() {
		int per = (2 * this.length) + (2 * this.width);
		return per;
	}
	
	public boolean isBigger(Rectangle other) {
		if(this.calculateArea() > other.calculateArea()) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isSquare() {
		if(this.length == this.width) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return ("Length: "+this.length + "\n" +" Width: "+this.width);
		
	}
	

}
