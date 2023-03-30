package studio7;

public class Rectangle {

	private int length;
	private int width;



public Rectangle(int initlength, int initwidth)
{
	length = initlength;
	width = initwidth;
}

public int getLength() {
	return length;
}
public int getWidth() {
	return width;
}
public int calculateArea() {
	return length * width;
}
public int calculatePerimeter() {
	return  2* (length + width);
}	
public boolean square() {
	if (length == width) {
		return true;
	}
	else {
		return false;
	}
}
public static boolean rectangleIsSmaller(Rectangle r1, Rectangle r2) {
	if (r1.calculateArea() < r2.calculateArea()) {
		System.out.println("r1 is smaller than r2");
		return true;
	}
	if (r1.calculateArea() == r2.calculateArea()) {
		System.out.println("r1 is the same size as r2");
		return false;
	}
	else {
		System.out.println("r2 is smaller than r1");
		return false;
	}
}
	public static void main(String[] args)
	{
	   Rectangle r1 = new Rectangle(6,7);
	   Rectangle r2 = new Rectangle(5,5);
	   rectangleIsSmaller (r1, r2);
	   System.out.println("r1 area: " + r1.calculateArea());
	   System.out.println("r1 perimeter: " + r1.calculatePerimeter());

	   System.out.println("r2 area: " + r2.calculateArea());
	   System.out.println("r2 perimeter: " + r2.calculatePerimeter());
	}
}

