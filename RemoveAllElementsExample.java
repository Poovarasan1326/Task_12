package task_12;

import java.util.ArrayList;

public class RemoveAllElementsExample {

	public static void main(String[] args) {

		ArrayList<String> stringList = new ArrayList<>();

		stringList.add("Object 1");
		stringList.add("Object 2");
		stringList.add("Object 3");

		System.out.println("Original ArrayList: " + stringList);

		stringList.clear();

		System.out.println("ArrayList after removing all elements: " + stringList);
	}
}
