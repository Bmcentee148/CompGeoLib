package compgeo_lib;

import java.io.*;
public class PolyDemo {

	public static void main(String[] args) {

		
		VertexList vList;
		try{
		    vList = new VertexList();
			Point2D[] points = CGTools.readPointsFromFile(new File("test.txt"));
			for(Point2D p: points)
				vList.add(new Vertex(p));

			Poly p = new Poly(vList);
			System.out.println(p);
		} catch(IOException e) {
			System.err.println(e);
		}

	
		
	}
}