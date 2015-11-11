package compgeo_lib;

public class VertexListDemo {

	public static void main(String[] args) {
		Point2D p1 = new Point2D(0,0);
		Point2D p2 = new Point2D(0,1);
		Point2D p3 = new Point2D(1,1);
		Point2D p4 = new Point2D(2,3);

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
		vList.remove();
		vList.remove();

		Vertex[] vArr = vList.toArray(new Vertex[vList.size()]);
		for(int i = 0; i < vArr.length; i++) {
			System.out.println(vArr[i]);
			System.out.println("Prev: " + vArr[i].prev);
			System.out.println("Next: " + vArr[i].next);
		}
	}
}