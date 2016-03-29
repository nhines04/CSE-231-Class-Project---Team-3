package project.production;
import project.helper.*;
import java.util.*;

public class Team3{
	public SinglyLinkedList<Integer> list20, list2k, list20k;
	
	public Team3(Integer[] array1, Integer[] array2, Integer[] array3){
		list20 = new SinglyLinkedList<Integer>(array1);
		list2k = new SinglyLinkedList<Integer>(array2);
		list20k = new SinglyLinkedList<Integer>(array3);
	}
	
	public void testLists(){
		long time;
		time = testList(list20);
		System.out.println("List of 20 integers took " + time + "ns to search.");
		time = testList(list2k);
		System.out.println("List of 2,000 integers took " + time + "ns to search.");
		time = testList(list20k);
		System.out.println("List of 20,000 integers took " + time + "ns to search.");
	
	}
	public long testList20(){
		return testList(list20);
	}
	public long testList2k(){
		return testList(list2k);
	}
	public long testList20k(){
		return testList(list20k);
	}
	
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