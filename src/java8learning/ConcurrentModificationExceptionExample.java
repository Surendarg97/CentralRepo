package java8learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.lang.Iterable;
java.util.function.Consumer;

public class ConcurrentModificationExceptionExample {

	public static void maina(String args[]) {
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			/*
			 * if (value.equals("3")) myList.remove(value);
			 */
		}

		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				//myMap.put("1", "4");
				myMap.put("4", "4");
			}
		}

	}
	


	 static class ConcurrentModificationExceptionWithArrayListSubList {

		public static void main(String[] args) {

			List<String> names = new ArrayList<>();
			names.add("Java");
			names.add("PHP");
			names.add("SQL");
			names.add("Angular 2");

			List<String> first2Names = names.subList(0, 2);

			System.out.println(names + " , " + first2Names);

			names.set(1, "JavaScript");
			// check the output below. :)
			System.out.println(names + " , " + first2Names);

			// Let's modify the list size and get ConcurrentModificationException
			names.add("NodeJS");
			System.out.println(names + " , " + first2Names); // this line throws exception

		}

	}

	
	
	
}


