package buckysWordsArray;
import java.util.*;

public class BuckysWordsArray {
	public static void main(String args[]) {
		
		String[] words = {"funk", "chunk", "furry", "baconator"};
		
		//startsWith
		for (String w : words) {
			if (w.startsWith("fu")) {
				System.out.println(w + " starts with fu");
			}
		}
		
		//ends with
		for (String w : words) {
			if (w.endsWith("unk")) {
				System.out.println(w + " ends with unk");
			}
		}
		
		String s = "buckyrobertsbuckyroberts";
		
		// search for first index of 'k' and returns the actual index number (starting with 0)
		System.out.println(s.indexOf('k'));
		// search for first index of 'k' but ignore first 5
		System.out.println(s.indexOf('k', 5));
		// not found should give -1
		System.out.println(s.indexOf('x'));
		// gives starting point of sub group
		System.out.println(s.indexOf("rob"));
		// starting at a different point of search
		System.out.println(s.indexOf("rob", 10));
		
		String a = "Bacon ";
		String b = "monster";
		// concatenation
		System.out.println(a + b);
		// another way to concatenate
		System.out.println(a.concat(b));
		
		// replace first parameter is replaced with second parameter
		System.out.println(a.replace('B', 'F'));
		
		// Uppercase
		System.out.println(b.toUpperCase());
		
		// use those to change first or remaining letters for a form

		// remove spaces with trim()
		System.out.println(a.trim() + b);
		
		// RECURSION method
		System.out.println(fact(5));
		
		//COLLECTIONS - Dynamic (Arrays are not dynamic) - Different types like SET and LIST
		String[] array1 = {"eggs", "lasers", "hats", "pie"};
		List<String> list1 = new ArrayList<String>();
		
		//add array items to list
		for (String x : array1) {
			list1.add(x);
		}
		
		String[] array2 = {"lasers", "hats"};
		List<String> list2 = new ArrayList<String>();
		
		for (String y : array2) {
			list2.add(y);
		}
		System.out.println("List 1:");

		for (int i = 0; i < list1.size() ; i++) {
			System.out.printf("%s ", list1.get(i));
		}
		
		System.out.println("\nList 2:");
		for (int i = 0; i < list2.size() ; i++) {
			System.out.printf("%s ", list2.get(i));
		}
		
		System.out.print("\nRevised List 1:");
		
		editList(list1, list2);
		System.out.println();
		for (int i = 0; i < list1.size() ; i++) {
			System.out.printf("%s ", list1.get(i));
		}
	}
	
	// RECURSION (like factorial 5 * 4 * 3 * 2 * 1 = 120
	// factorial method
	public static long fact(long n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
	
	// removing items from list1 that are in both list1 and list2
	public static void editList(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		
		while(it.hasNext()) {
			if (l2.contains(it.next())) {
				it.remove();
			}
		}
	}
}
