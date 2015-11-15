package compgeo_lib;
/* #############################################################################
	Class Poly -- A Polygon consisting of vertices listed in CCW order

	@author Brian McEntee
	@version 1.0
##############################################################################*/

public class Poly {
	//INSTANCE VARS
	protected VertexList vList;
	
	//CONSTRUCTORS
	private Poly(){
	//restrict access to default constructor
	}

	public Poly(VertexList vList) {
		this.vList = vList;
	}

	//CORE METHODS
	public int getNumConvexVerts() {
		int cv = 0;
		for(Vertex v : vList) 
			if( CGTools.left(v.prev.getPoint(),v.getPoint(),v.next.getPoint())) 
				cv++;
		return cv;
	}

	public int getNumReflexVerts() {
		return getNumVerts() - getNumConvexVerts();
	}

	public int getNumVerts() {
		return vList.size();
	}

	public double getArea() {
		double area2 = 0;
		Vertex v_curr;
		Vertex v_prev = vList.get(vList.size() - 1);
		for(int i = 0; i < vList.size(); i++) {
			v_curr = vList.get(i);
			area2 += ( v_prev.getPoint().getX() + v_curr.getPoint().getX() ) * 
					 ( v_prev.getPoint().getY() - v_curr.getPoint().getY() );
			v_prev = v_curr;
		}
		return  -1 * (area2 / 2.0);
	}

	public String toString() {
		String str = "Number of Vertices: " + getNumVerts() +
					 "\nNumber of Convex Vertices: " + getNumConvexVerts() + 
					 "\nNumber of Reflexive Vertices: " + getNumReflexVerts() + 
					 "\nArea of Polygon: " + getArea() + "\n";

		return str;
	}


}