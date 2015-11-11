package compgeo_lib;
public class PointTest {

	public static void main(String[] agrs) {
		Point2D p = new Point2D(1,2);
		System.out.println(p);
		p.printPoint();

		//Test for direct access to protected members of Point2D class
		System.out.println(p.getX());
		System.out.println(p.getY());
	}
}