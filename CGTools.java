package compgeo_lib;
/*##############################################################################
	Class CGTools -- a helper class for use with Points, Vertexes, and Polys

	area2(Point2D a, Point2D b, Point2D c) -- returns twice the signed area of 
	the triangle represented. pos if ccw, neg if cw
	
	left(Point2D a, Point2D b, Point2D c) -- determines if c is left of a-b

	leftOn(Point2D a, Point2D b, Point2D c) --	determines if c is left of or
	collinear with a-b

	collinear(Point2D a, Point2D b, Point2D c) -- determines if c is collinear
	with a-b

	@author Brian McEntee
	@version 1.0
##############################################################################*/

public class CGTools {

	public static double area2(Point2D a, Point2D b, Point2D c) {
		return ( (b.getX() - a.getX()) * (double)(c.getY() - a.getY())) - 
				((b.getY() - a.getY()) * (double)(c.getX() - a.getX()) );
	}

	public static int areaSign(Point2D a, Point2D b, Point2D c) {
		int area = (int)area2(a,b,c);
		if(area > .5) return 1;
		else if(area < -.5) return -1;
		else return 0;

	}

	public static boolean left(Point2D a, Point2D b, Point2D c) {
		return areaSign(a,b,c) > 0; 
	}

	public static boolean leftOn(Point2D a, Point2D b, Point2D c) {
		return areaSign(a,b,c) >= 0;
	}

	public static boolean collinear(Point2D a, Point2D b, Point2D c) {
		return areaSign(a,b,c) == 0;
	}


}