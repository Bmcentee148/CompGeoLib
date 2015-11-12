package compgeo_lib;
/*##############################################################################
	Class CG_TestTools -- class to help testing of cg implementations
	
	printVertexList(VertexList vList) -- prints each vertice in order and 
	reports their prev and next verts
	
	@author Brian McEntee
	@version 1.0
##############################################################################*/

class CG_TestTools {

	public static void printVertexList(VertexList vList) {
		Vertex[] vArr = vList.toArray(new Vertex[vList.size()]);
		for(int i = 0; i < vArr.length; i++) {
			System.out.println("Vertex" + (i+1) + ": " + vArr[i]);
			System.out.println("Prev: " + vArr[i].prev);
			System.out.println("Next: " + vArr[i].next);
		}
	}

}