/**
* This class is responsible for generating Links used to build the
* SinglyLinkedList<SingleLink>
*@author Team 3
*@version "version 1.0 160329"
*@since "version 1.0"
*/

public class Link<T>{
	/**
	* Variables to hold the data associated with the Link as well as
	* a reference to the next link in the SinglyLinkedList
	*/
	private T data;
	private Link<T> next;
	
	/**
	* Overloaded constructor
	*@param t, generic constructor parameter to set data for new Link
	*/
	public Link(T t){
		data = t;
	}
	
	/**
	* Getter method, returns data associated with Link
	*@return data, the data associated with the Link
	*/
	public T getData() {
		return data;
	}
	
	/**
	* Method which returns reference to next Link in SinglyLinkedList
	*@return next, a reference to the next Link in the SinglyLinkedList
	*/
	public Link<T> getNext() {
		return next;
	}
	
	/**
	* Setter method, sets the reference to the next Link in the SinglyLinkedList
	* relative to the current Link
	*@param next, the Link that is to come after the current Link
	*/
	public void setNext(Link<T> next) {
		this.next = next;
	}	
}