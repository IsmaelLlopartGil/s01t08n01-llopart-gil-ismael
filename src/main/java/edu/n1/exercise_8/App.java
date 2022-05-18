package edu.n1.exercise_8;

public class App {

	public static void main(String[] args) {

		StringInverter stringInverter= (string) -> new StringBuilder(string).reverse().toString();
		
		System.out.println(stringInverter.reverse("Cadena"));
	}
}
