package project.helper;
import project.helper.Link;
import project.helper.LinkedListIterator;
import java.util.Iterator;

public class SinglyLinkedList<T>{
	Link<T> head;
	public SinglyLinkedList(T[] array){
		head = new Link<T>(array[array.length - 1]);
		Link<T> temp;
		for(int i = array.length - 2; i >= 0; i--){
			temp = new Link<T>(array[i]);
			temp.setNext(head);
			head = temp;
		}
	}
	
	public Iterator iterator(){
		return new LinkedListIterator(head);
	}
}	




