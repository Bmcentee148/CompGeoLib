package compgeo_lib;
/* #############################################################################
	Class Point2D -- A point in two dimensions

	displayPoint() -- displays the coordinates of the point (x,y)

	@author Brian McEntee
	@version 1.0

##############################################################################*/

public class Point2D {
	// coordinates will remain unchanged once initialized
	private final int X;
	private final int Y;

	private Point2D() {
		// restrict access to default constructor by access modif.
		// coordinates should be set explicity
		X = Y = 0;
	}

	public Point2D(int x_coord, int y_coord) {
		X = x_coord;
		Y = y_coord;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public void printPoint() {
		System.out.println(this); //utilizes objects toString() method
	}

	public String toString() {
		return "(" + X + "," + Y + ")";
	}
}