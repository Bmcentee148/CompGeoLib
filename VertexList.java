package compgeo_lib;
/*##############################################################################
	Class VertexList -- type of LinkedList that stores Vertex's in order

	add(Vertex v) -- updates prev and next of head, tail, and v then adds v

	remove() -- updates prev and next of new head and tail vertex and removes head

	@author Brian McEntee
	@version 1.0
##############################################################################*/
import java.util.LinkedList;

public class VertexList extends LinkedList<Vertex> {

	@Override
	public boolean add(Vertex v) {
		if(this.size() == 0) {
			v.next = v;
			v.prev = v;
		}
		else {
			Vertex end = this.get(size() - 1);
			Vertex head = this.get(0);
			end.next = v;
			v.prev = end;
			head.prev = v;
			v.next = head;
		}
		super.add(v);
		return true;
	}

	@Override
	public Vertex remove() {
		Vertex removed = null;
		if(this.size() > 1) {
			removed = this.get(0);
			Vertex end = this.get(size() - 1);
			Vertex head = this.get(1);
			head.prev = end;
			end.next = head;
			removed = super.remove();
		}
		else{
			 removed = super.remove();
		}
		return removed;
	}

}