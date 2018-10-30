package pkgTest;

import org.junit.jupiter.api.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;
import pkgShape.Shape;

public class TestShape {
	
	@Test
	public void RectangleTest() {
		//Rectangle Test
		int width = 5, length = 7;
		Shape rectangle = new Rectangle(width, length);
		// Tests area and perimeter
		System.out.println("Rectangle Width: " + width + "\nRectangle Length: " + length +
				"\nRectangle Area: " + rectangle.area() + "\nRectangle Perimeter: " + rectangle.perimeter() + "\n");
	}

	@Test
	public void getWidthTest() {
		int width = 5, length = 7;
		Rectangle rectangle = new Rectangle(width, length);
		System.out.println("Rectangle Width: " + rectangle.getWidth()); 
		
	}
	
	@Test
	public void setWidthTest() {
		int width = 5, length = 7;
		Rectangle rectangle = new Rectangle(width, length);
		rectangle.setWidth(6);
		System.out.println("Rectangle Width: " + rectangle.getWidth());
	}
	
	@Test
	public void getLengthTest() {
		int width = 5, length = 7;
		Rectangle rectangle = new Rectangle(width, length);
		System.out.println("Rectangle Length: " + rectangle.getLength()); 
		
	}
	
	@Test
	public void setLengthTest() {
		int width = 5, length = 7;
		Rectangle rectangle = new Rectangle(width, length);
		rectangle.setLength(8);
		System.out.println("Rectangle Length: " + rectangle.getLength());
	}
	
	@Test
	public void compareToTest() {
		int a = 5, b = 7;
		Rectangle rectangle = new Rectangle(a, b);
		int c = 10, d = 12;
		Rectangle rectangle2 = new Rectangle(c, d);
		System.out.println("Bigger Rectangle: " + rectangle.compareTo(rectangle2));
		
	}
	
	@Test
	public void CuboidTest() {
		//Cuboid Test
		int width = 5, length = 5, depth = 3;
		Cuboid cuboid = new Cuboid(width, length, depth);
		// Tests area and volume
		System.out.println("Cuboid Width: " + width + "\nCuboid Length: " + length + "\nCuboid Depth: " + depth +
				"\nSurface Area: " + cuboid.area() + "\nVolume: " +  cuboid.volume() + "\n");
	}
	
	@Test
	public void getDepthTest() {
		int width = 5, length = 5, depth = 3;
		Cuboid cuboid = new Cuboid(width, length, depth);
		System.out.println("Cuboid Depth: " + cuboid.getDepth());
	}
	
	@Test
	public void setDepthTest() {
		int width = 5, length = 5, depth = 3;
		Cuboid cuboid = new Cuboid(width, length, depth);
		cuboid.setDepth(7);
		System.out.println("Cuboid Depth: " + cuboid.getDepth());
	}
	
//	@Test
//	public void perimeterTest() {
//		int width = 5, length = 5, depth = 3;
//		Cuboid cuboid = new Cuboid(width, length, depth);
//		System.out.println(cuboid.perimeter());
//	}
	
	public void SortByAreaTest() {
		int a = 5, b = 5, c = 3;
		Cuboid cuboid1 = new Cuboid(a, b, c);
		int d = 1, e = 20, f = 4;
		Cuboid cuboid2 = new Cuboid(d, e, f);
		// I would ideally use SortByArea here to show which cuboid has the bigger area, but I cannot figure out how.
	}
	
	public void SortByVolumeTest() {
		int a = 5, b = 5, c = 3;
		Cuboid cuboid1 = new Cuboid(a, b, c);
		int d = 1, e = 20, f = 4;
		Cuboid cuboid2 = new Cuboid(d, e, f);
		// I would ideally use SortByVolume here to show which cuboid has the bigger volume, but I cannot figure out how.
	}
	
}
