package project.helper;
import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {
	Link<T> link = new Link<T>(null);
		
		public LinkedListIterator(Link<T> l){
			link.setNext(l);
		}
		
		public boolean hasNext() {
			return link.getNext() == null ? false : true;
		}
		
		public T next() {
			link = link.getNext(); 		
			return link.getData();
		}
	}