package pkgShape;

import java.util.Comparator;

class SortByArea implements Comparator<Cuboid>{
	public SortByArea() {

	}

	public int compare(Cuboid cuboid1, Cuboid cuboid2) {
		return Double.compare(cuboid1.area(), cuboid2.area());
	}
}

class SortByVolume implements Comparator<Cuboid> {
	public SortByVolume() {

	}

	public int compare(Cuboid cuboid1, Cuboid cuboid2) {
		return Double.compare(cuboid1.volume(), cuboid2.volume());
	}
}

public class Cuboid extends Rectangle {
	private int iDepth;

	@Override
	public String toString() {
		return "" + this.getiWidth();
	}
	
	public Cuboid(int width, int length, int depth) {
		super(width, length);
		if (depth <= 0) {
			throw new IllegalArgumentException();
		}
		this.setiDepth(depth);
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	public double volume() {
		return this.getiDepth() * this.getiLength() * this.getiWidth();
	}

	public double area() {
		return 2 * (this.getiDepth() * this.getiLength() + this.getiDepth() * this.getiWidth()
				+ this.getiLength() * this.getiWidth());
	}

	public double perimeter() {
		boolean notSupport = true;
		if (notSupport) {
			throw new UnsupportedOperationException();
		}
		return 0;
	}

	public int compareTo(Object obj2) {
		return 1;
	}

	

	
}
