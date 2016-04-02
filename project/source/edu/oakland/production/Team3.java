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
	SinglyLinkedList<Integer> list20, list2k, list20k;
	
	/**
	*Constructs a Team3 object and takes 3 int[] arrays and calls methods
	*to generate the SinglyLinkedLists.
	*@param array1 int[] array with 20 elements.
	*@param array2 int[] array with 2000 elements.
	*@param array3 int[] array with 20,000 elements.
	*/
	public Team3(Integer[] array1, Integer[] array2, Integer[] array3) {
		list20 = new SinglyLinkedList<Integer>(array1);
		list2k = new SinglyLinkedList<Integer>(array2);
		list20k = new SinglyLinkedList<Integer>(array3);
	}

	/**
	*This method prints the time it took to search each of the 3 SinglyLinkedLists.
	*/
	public void testLists() {
		long time;
		time = testList(list20);
		System.out.println("List of 20 integers took " + time + "ns to search.");
		time = testList(list2k);
		System.out.println("List of 2,000 integers took " + time + "ns to search.");
		time = testList(list20k);
		System.out.println("List of 20,000 integers took " + time + "ns to search.");
	
	}
	/**
	*This method is called to test the 20 element SinglyLinkedList.
	*@return the elapsed time that testList returns after searching the 20 
	*element list.
	*/
	public long getTimeOne() {
		return testList(list20);
	}
	
	/**
	*This method is called to test the 2000 element SinglyLinkedList.
	*@return the elapsed time that testList returns after searching the 2000 
	*element list.
	*/
	public long getTimeTwo() {
		return testList(list2k);
	}
	
	/**
	*This method is called to test the 20,000 element SinglyLinkedList.
	*@return the elapsed time that testList returns after searching the 20,000 
	*element list.
	*/
	public long getTimeThree() {
		return testList(list20k);
	}
	
	/**
	*This method is called to find the first two even numbers between 500 and 5000
	*in the SinglyLinkedList
	*@param list SinglyLinkedList being searched
	*@return the first two even number between 500 and 5000 in the SinglyLinkedList
	*/
	public int[] getFirstTwoEvens(SinglyLinkedList<Integer> list){
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
		return evens;
	}
	
	/**
	*This method returns the first two even integers between 500 and 5000 in the
	*20-element list
	*@return the first two even number between 500 and 5000 in the SinglyLinkedList
	*/
	public int[] getValuesOne() {
		return getFirstTwoEvens(list20);
	}
	
	/**
	*This method returns the first two even integers between 500 and 5000 in the
	*2000-element list
	*@return the first two even number between 500 and 5000 in the SinglyLinkedList
	*/
	public int[] getValuesTwo() {
		return getFirstTwoEvens(list2k);
	}
	
	/**
	*This method returns the first two even integers between 500 and 5000 in the
	*20,000-element list
	*@return the first two even number between 500 and 5000 in the SinglyLinkedList
	*/
	public int[] getValuesThree() {
		return getFirstTwoEvens(list20k);
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