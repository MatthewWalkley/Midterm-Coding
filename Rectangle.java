package pkgShape;

import org.junit.Test;

public class Rectangle extends Shape implements Comparable<Object> {
	private int iWidth;
	private int iLength;
	
	public Rectangle(int width, int length) {
		if (width<=0 || length<=0) {
			throw new IllegalArgumentException();
		}
		this.setiWidth(width);
		this.setiLength(length);
	}

public int getiWidth() {
	return iWidth;
}

public void setiWidth(int iWidth) {
	this.iWidth = iWidth;
}

public int getiLength() {
	return iLength;
}

public void setiLength(int iLength) {
	this.iLength = iLength;
}

public double perimeter() {
	return 2 * (getiWidth() + getiLength());
}

public double area() {
	return getiWidth() * getiLength();
}

public int compareTo(Object obj2) {
	return Double.compare(this.area(), (((Rectangle) obj2).area()));
}

@Test(expected = IllegalArgumentException.class)
public void testIllegalArgument() {
	new Rectangle(0,-3);
}

}

