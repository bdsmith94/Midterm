package pkgShape;

public class Rectangle extends Shape {
	
	//sides
	private int width;
	private int length;
		
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int l) {
		length = l;
	}
	
	
	
	@Override
	public double area() {
		// Area = length * width
		return length * width;
	}
	
	@Override
	public double perimeter() {
		//Perimeter = 2(length + width)
		return 2 * (width + length);
	}
	
	public int compareTo(Object o) {
		Rectangle r = (Rectangle) o;
		return new Double(r.area()).compareTo(this.area());
	}
	

}
