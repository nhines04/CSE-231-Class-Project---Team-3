package edu.oakland.helper;

import java.util.Iterator;

/**
* This class is responsible for generating the SinglyLinkedList<SingleLink> from
* SingleLinks created by the SingleLink class
*@author Team 3
*@version "version 1.0 160329"
*@since "version 1.0"
*/

public class SinglyLinkedList<T>{
	/**
	* Variable representing the head Link in the SinglyLinkedList
	*/
	Link<T> head;
	
	/**
	* Overloaded constructor, builds the SinglyLinkedList from SingleLink
	* objects based on the values in the array passed as a parameter
	*@param array, the array containing the values which will be used to create
	* the Links in the SinglyLinkedList
	*/
	public SinglyLinkedList(T[] array){
		head = new Link<T>(array[array.length - 1]);
		Link<T> temp;
		for(int i = array.length - 2; i >= 0; i--){
			temp = new Link<T>(array[i]);
			temp.setNext(head);
			head = temp;
		}
	}
	
	/**
	* Method to generate an Iterator object for the SinglyLinkedList based
	* on the current head Link
	*@return LinkedListIterator object which contains a reference to the current
	* and next Links
	*/
	public Iterator iterator(){
		return new LinkedListIterator(head);
	}
}	




