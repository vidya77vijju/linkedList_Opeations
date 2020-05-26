package org.studyeasy;
import java.util.LinkedList;
public class exam {
	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Spain");
		countries.add("UAE");
		countries.add("Poland");
		exam ex = new exam();
		ex.printLinkedList(countries);
		System.out.println("************************");
		countries.add(1,"Russia");
		ex.printLinkedList(countries);
		System.out.println("************************");
		countries.set(4, "Singapore");
		ex.printLinkedList(countries);
		System.out.println("************************");
		countries.remove(2);
		ex.printLinkedList(countries);
	}
	void printLinkedList(LinkedList<String> countries) {
		for(String country : countries) {
			System.out.println("Country: "+country);
		}
	}
}
