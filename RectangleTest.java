package pkgTestShape;

import org.junit.Assert;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {
	@Test
	public void testConstruction() {
		new Rectangle(5, 6);
	}
	@Test
	public void testGetterSetter() {
		int width = 6;
		int length = 5;
		Rectangle rect = new Rectangle(width, length);
		Assert.assertEquals(width, rect.getiWidth());
		Assert.assertEquals(length, rect.getiLength());

		rect.setiWidth(10);
		rect.setiLength(20);
		Assert.assertEquals(10, rect.getiWidth());
		Assert.assertEquals(20, rect.getiLength());
	}

	@Test
	public void testArea() {
		Rectangle rect = new Rectangle(3, 2);
		Assert.assertEquals(6, rect.area(), 0.001);
	}

	@Test
	public void testPerimeter() {
		Rectangle rect = new Rectangle(2, 3);
		Assert.assertEquals(10, rect.perimeter(), 0.000);
	}
	
	@Test
	public void testCompareTo() {
		Rectangle rect1 = new Rectangle(3, 3);
		Rectangle rect2 = new Rectangle(4, 4);
		Assert.assertTrue(rect1.compareTo(rect2) < 0);
		Assert.assertTrue(rect2.compareTo(rect1) > 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalArgumentException() {
		new Rectangle(0, -3);
	}

}
