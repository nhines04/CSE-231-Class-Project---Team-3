import java.util.Iterator;

/**
* This class is responsible for generating the Iterator object which will be 
* used to iterate through Links in the SinglyLinkedList
*@author Team 3
*@version "version 1.0 160329"
*@since "version 1.0"
*/

public class LinkedListIterator<T> implements Iterator<T> {
	/**
	* Variable containing reference to the next Link
	*/
	Link<T> link = new Link<T>(null);
	
	/**
	* Overloaded constructor, sets the next Link for the Iterator
	*@param 1, reference to the next Link
	*/
	public LinkedListIterator(Link<T> l){
		link.setNext(l);
	}
	
	/**
	* Method which returns boolean to determine whether or not a next
	* Link exists
	*@return boolean, True if next Link exists and False if not
	*/
	public boolean hasNext() {
		return link.getNext() == null ? false : true;
	}
	
	/**
	* Method which advances the Iterator to the next Link and returns the
	* data contained in that Link
	*@return data contained by new next Link
	*/
	public T next() {
		link = link.getNext(); 		
		return link.getData();
	}
}