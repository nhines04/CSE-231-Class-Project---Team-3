package edu.oakland.test;
import project.production.*;
import java.util.*;

public class Team3Test{
	public static Team3 setUp(){
		int i;
		Integer[] arrRand1 = new Integer[20];
		Integer[]arrRand2 = new Integer[2000];
		Integer[] arrRand3 = new Integer[20000];
		for(i=0;i<20;i++){
			arrRand1[i] = (int)(Math.random()*10);
		}
		for(i=0;i<2000;i++){
			arrRand2[i] = (int)(Math.random()*10);
		}
		for(i=0;i<20000;i++){
			arrRand3[i] = (int)(Math.random()*10);
		}
		return new Team3(arrRand1, arrRand2, arrRand3);
	}
	public static void main(String[] args){
		
		Team3 asdf = setUp();
		asdf.testLists();
	}
}