package edu.n1.exercise_7;

import java.util.*;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		Map<String, Integer> monthMap=new TreeMap<>();
		
		monthMap.put("january", 31);
		monthMap.put("february", 28);
		monthMap.put("march", 31);
		monthMap.put("april", 30);
		monthMap.put("may", 31);
		monthMap.put("june", 30);
		monthMap.put("july", 31);
		monthMap.put("August", 31);
		monthMap.put("september", 30);
		monthMap.put("october", 31);
		monthMap.put("november", 30);
		monthMap.put("december", 31);
		
		Stream<Map.Entry<String, Integer>> sorted=
				monthMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey((String s1, String s2) -> s2.length()-s1.length()));
		
		sorted.forEach(System.out::println);
	}
}