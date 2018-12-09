package nCollectionSet;

import java.util.*;

public class aa {
	// HashSet, LinkedHashSet, TreeSet
	public static void main(String[] args){
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("cc");
		hs.add("bb");
		hs.add("aa");
		hs.add("bb");
		Iterator<String> it1 = hs.iterator();
		System.out.println("---HashSet---");
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("---HashSet---");

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("cc");
		lhs.add("bb");
		lhs.add("aa");
		lhs.add("bb");
		Iterator<String> it2 = lhs.iterator();
		System.out.println("---LinkedHashSet---");
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("---LinkedHashSet---");
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("cc");
		ts.add("bb");
		ts.add("aa");
		ts.add("bb");
		Iterator<String> it3 = ts.iterator();
		System.out.println("---TreeSet---");
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
		System.out.println("---TreeSet---");
	}
}
