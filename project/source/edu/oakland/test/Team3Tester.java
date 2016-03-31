package edu.oakland.test;

import project.production.*;
import java.util.*;

/**
*This class tests the Team3 class to see if it correctly determines the amount
*of time required to search 200, 2k, 20k, length singly linked lists for the
*first two even and odd integers between 500 and 5k
*@author team 3
*@version version 1.2 160330
*@since version 1.2
*/

public class Team3Tester{
	/**
	*This method is called to set up 3 arrays that hold integers that are
	*generated at random between 20-20000. Then it returns the result from plugging
	*the 3 arrays into Team3.
	*/
	public static Team3 setUp(){
		int i;
		//sets up arrays to their respective lengths for testing
		Integer[] arrRand1 = new Integer[20];
		Integer[] arrRand2 = new Integer[2000];
		Integer[] arrRand3 = new Integer[20000];
		//fills void arrays with random integers between 20 - 20000
		for(i=0;i<20;i++){
			arrRand1[i] = (int)((Math.random()*199800) + 20);
		}
		for(i=0;i<2000;i++){
			arrRand2[i] = (int)((Math.random()*199800) + 20);
		}
		for(i=0;i<20000;i++){
			arrRand3[i] = (int)((Math.random()*199800) + 20);
		}
		return new Team3(arrRand1, arrRand2, arrRand3);
	}
	/**
	*The main method calls setUp and testLists
	*/
	public static void main(String[] args){
		
		Team3 asdf = setUp();
		asdf.testLists();
	}
}