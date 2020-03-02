package buckysWordsArray;

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

		// remove spaces
		System.out.println(a.trim() + b);


	}
}
