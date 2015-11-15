/*
package compgeo_lib;
import java.io.*;
public class VertexListDemo {

	public static void main(String[] args) {
		Point2D p1 = new Point2D(0,0);
		Point2D p2 = new Point2D(0,1);
		Point2D p3 = new Point2D(1,1);
		Point2D p4 = new Point2D(2,3);

		Point2D p5 = new Point2D(1,1);
		Point2D p6 = new Point2D(5,5);
		Point2D p7 = new Point2D(9,9);

		System.out.println(CGTools.area2(p5,p6,p7)); //0.0
		System.out.println(CGTools.collinear(p5,p6,p7)); //true
		System.out.println(CGTools.left(p1,p2,p4)); //false
		System.out.println(CGTools.left(p1,p3,p2)); //true
		System.out.println(CGTools.area2(p2,p1,p3)); //1.0
		System.out.println(CGTools.left(p2,p1,p3)); //true

		Vertex v1 = new Vertex(p1);
		Vertex v2 = new Vertex(p2);
		Vertex v3 = new Vertex(p3);
		Vertex v4 = new Vertex(p4);

		VertexList vList = new VertexList();
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);

		vList.remove();
		vList.remove();
		
		CG_TestTools.printVertexList(vList);

		File tf = new File("test.txt");
		Point2D[] points = null;
		try {
			points = CGTools.readPointsFromFile(tf);
		} catch(IOException e) {
			System.err.println("Error: " + e);
		}
		for(Point2D p : points)
				System.out.println(p);

	}

}
*/
