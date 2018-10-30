package pkgShape;

public class Cuboid extends Rectangle {
	private int length, width, depth;
	
	public Cuboid(int width, int length, int depth) {
		super(length, width);
		this.depth = depth;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public void setDepth(int d) {
		depth = d;
	}
	
	@Override
	public double area() {
		//surface area = length * width * # of faces
		return 6 * super.area();
	}
	
	public double volume() {
		//volume = length * width * depth
		return super.area() * depth;
	}
	
	public double perimeter() {
		throw new UnsupportedOperationException("Invalid operation for cuboid");
	}
	
	@Override
	public int compareTo(Object o) {
		Cuboid c = (Cuboid) o;
		return new Double(c.area()).compareTo(this.area());
	}
	
	class SortByArea {
		public int compare(Cuboid a, Cuboid b) {
			return new Double(a.area()).compareTo(b.area());
		}
	}
	
	class SortByVolume {
		public int compare(Cuboid a, Cuboid b) {
			return new Double(a.volume()).compareTo(b.volume());
		}
	}
	
	
	

}
