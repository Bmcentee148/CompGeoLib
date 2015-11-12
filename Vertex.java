package compgeo_lib;
/*##############################################################################
	Class Vertex -- A point where two edges meet

	setEarity(boolean status) -- change status of the earity

	isEar() -- access earity status

	@author Brian McEntee
	@version 1.0
##############################################################################*/
public class Vertex {
	private boolean isEar;
	private Point2D p;
	Vertex prev, next;

	public Vertex(Point2D p) {
		this.p = p;
		prev = next = null;
		isEar = false;
	}

	public Vertex(Point2D p, Vertex prev, Vertex next) {
		this.p = p;
		this.prev = prev;
		this.next = next;
		isEar = false;
	}

	public boolean isEar() {
		return isEar;
	}

	public void setEarity(boolean status) {
		isEar = status;
	}

	@Override
	public String toString() {
		return p.toString() + ( (isEar) ? " ear":" not ear" );
	}

}