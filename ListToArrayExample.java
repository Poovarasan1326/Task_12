package task_12;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<>();
		stringList.add("Apple");
		stringList.add("Orange");
		stringList.add("Pineapple");

		String[] stringArray = stringList.toArray(new String[0]);

		System.out.println("Array elements:");
		for (String element : stringArray) {
			System.out.println(element);
		}
	}
}
