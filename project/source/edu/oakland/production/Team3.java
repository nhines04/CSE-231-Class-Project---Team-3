package edu.oakland.production;

import java.util.Iterator;
import edu.oakland.helper.*;

/**
*This class generates 3 singly linked lists, one for each size. Then it searches
*the singly linked lists for the first 2 even integers between 500 and 5,000
*and finds how much time those operations take.
*@author team 3
*@version version 1.0 160329
*@since version 1.0
*/
public class Team3{
	/**
	*list20, list2k, and list20k are SinglyLinkedLists with 20, 2000, and 20000
	*elements respectively.
	*/
	SinglyLinkedList<Integer> list;
	
	/**
	*Constructs a Team3 object and takes 3 int[] arrays and calls methods
	*to generate the SinglyLinkedLists.
	*@param array1 int[] array with 20 elements.
	*@param array2 int[] array with 2000 elements.
	*@param array3 int[] array with 20,000 elements.
	*/
	public Team3(Integer[] array) {
		list = new SinglyLinkedList<Integer>(array);
	}
	
	/**
	*This method is called to find the first two even numbers between 500 and 5000
	*in the SinglyLinkedList
	*@param list SinglyLinkedList being searched
	*@return the first two even number between 500 and 5000 in the SinglyLinkedList
	*/
	public int[] getValues(){
		Iterator<Integer> iterator = list.iterator();
		int[] evens = new int[2];
		int num = 0;
		int found = 0;
		
		while(iterator.hasNext() && found < 2){
			num = iterator.next();
			if(num >= 500 && num <= 5000 && num % 2 == 0){
				evens[found] = num;
				found++;
			}
		}	
		if(found == 0){
			evens[0] = -1;
			evens[1] = -1;
		}
		else if(found == 1){
			evens[1] = -1;
		}
		return evens;
	}
	
	/**
	*This method is called to determine how long it takes to find the first 
	*two even numbers between 500 and 5000 in the SinglyLinkedList
	*@return the time it took to find first two even integers in SinglyLinkedList
	*/
	public long getTime() {
		return testList(list);
	}
	
	/**
	*This method iterates through the sent SinglyLinkedList and finds the first
	*2 ints within, and times the operation.
	*@param list the SinglyLinkedList to search through.
	*@return the time the operation takes to complete.
	*/
	private long testList(SinglyLinkedList<Integer> list){
		long startTime;
		long finishTime;
		Iterator<Integer> iterator = list.iterator();
		int data = 0;
		int intsFound = 0;
		//start the timer
		startTime = System.nanoTime();
		while(iterator.hasNext() && intsFound < 2){
			data = iterator.next();
			if(data >= 500 && data <= 5000 && data % 2 == 0){
				intsFound++;
			}
		}
		// end the timer
		finishTime = System.nanoTime() - startTime;
		return finishTime;
	}
}