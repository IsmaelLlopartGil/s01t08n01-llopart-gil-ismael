package edu.n1.exercise_2;

import java.util.*;
import java.util.stream.Collectors;

public class App {

	private List<String> strings;

	public void start() {
		strings = new ArrayList<String>();
		strings.add("algo");
		strings.add("cinco");
		strings.add("otra cosa");
		strings.add("sin la letra");
		strings.add("dim sum");
		strings.add("otorrinolargongologo");
		strings.add("Érase que se era");
		strings.add("ultima");

		List<String> listWithOAndMoreThanFiveLetters = strings.stream()
				.filter(c -> c.contains("o") && c.length()>5)
				.collect(Collectors.toList());

		System.out.println(listWithOAndMoreThanFiveLetters);

	}

	public static void main(String[] args) {
		App app = new App();
		app.start();
	}

}
