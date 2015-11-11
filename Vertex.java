package compgeo_lib;

public class Vertex {
	private boolean isEar;
	private Point2D p;
	Vertex prev, next;

	public Vertex(Point2D p) {
		this.p = p;
		prev = next = null;
	}

	public Vertex(Point2D, Vertex prev, Vertex next) {
		this.prev = prev;
		this.next = next;
	}

	public boolean isEar() {
		return isEar;
	}

}