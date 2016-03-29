public class Link<T>{
	private T data;
	private Link<T> next;
	
	public Link(T t){
		data = t;
	}
	
	public T getData() {
		return data;
	}
	public Link<T> getNext() {
		return next;
	}
	public void setNext(Link<T> next) {
		this.next = next;
	}	
}