public class SinglyLinkedList {
	public static <T> SingleLink<T> fillLinkedList(T[] array){
		SingleLink<T> head = new SingleLink<T>(array[array.length - 1]);
		SingleLink<T> temp;
		for(int i = array.length - 2; i >= 0; i--){
			temp = new SingleLink<T>(array[i]);
			temp.setNext(head);
			head = temp;
		}
		return head;
	}
	
	public Iterator iterator(){
		return new LinkedListIterator(head);
}

public class SingleLink<T>{
	private T data;
	private SingleLink<T> next;
	
	public SingleLink(T t){
		data = t;
	}
	
	public T getData() {
		return data;
	}
	public SingleLink<T> getNext() {
		return next;
	}
	public void setNext(SingleLink<T> next) {
		this.next = next;
	}	
}

public class LinkedListIterator<T> implements Iterator<T> {
	SingleLink<T> link = new SingleLink<T>(null);
	
	public LinkedListIterator(SingleLink<T> l){
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