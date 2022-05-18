package edu.n1.exercise_4;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		List<String> monthList=new ArrayList<>();	
		monthList.add("january");
		monthList.add("february");
		monthList.add("march");
		monthList.add("april");
		monthList.add("may");
		monthList.add("june");
		monthList.add("july");
		monthList.add("september");
		monthList.add("october");
		monthList.add("november");
		monthList.add("december");
		
		monthList.forEach(System.out::println);  
	}
}
