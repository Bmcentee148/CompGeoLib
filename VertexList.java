package compgeo_lib;
import java.util.LinkedList;

public class VertexList extends LinkedList<Vertex> {

	@Override
	public boolean add(Vertex v) {
		if(this.size() == 0) {
			v.next = v;
			v.prev = v;
		}
		else {
			Vertex prev = this.get(size() - 1);
			Vertex next = this.get(0);
			prev.next = v;
			v.prev = prev;
			next.prev = v;
			v.next = next;
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