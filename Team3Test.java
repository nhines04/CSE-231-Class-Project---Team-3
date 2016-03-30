package edu.oakland.test;

import edu.oakland.production.*;
import edu.oakland.helper.*;
import edu.oakland.helper02.*;
import java.util.*;
import junit.framework.*;

/**
* This class is designed to test the Team3.java, Link.java, 
* SinglyLinkedList.java, and LinkedListIterator.java classes for Team 3's
* assignment on the CSE 231 class project
*@author Team 3
*@version "version 1.0 160329"
*@since "version 1.0"
*/

public class Team3Test extends TestCase{
	private Integer[] test; 
	private Team3 team3Test;
	
	public void setUp(){
		test = new Integer[20];
		
		for(int i = 0; i < 20; i++){
			test[i] = 500 + i;
		}
		
		System.out.print("Contents of test array, for visual inspection: ");
		for(int i = 0; i < 19; i++){
			System.out.print(test[i] + ", ");
		}
		System.out.println(test[19]);
		
		team3Test = new Team3(test, test, test);
	}
	
	public void testTeam3(){
		assertEquals(500, team3Test.getFirstEven(team3Test.getList20()));
		assertEquals(502, team3Test.getSecondEven(team3Test.getList20()));
		assertEquals(15, team3Test.getFirstEven(team3Test.getList20()));
	}
}