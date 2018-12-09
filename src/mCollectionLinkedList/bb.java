package mCollectionLinkedList;

import java.util.*;

public class bb {
	public static void main(String[] args){
		/*
		 Collection
		 	List -> ArrayList, LinkedList
		 	Queue
		 	Set -> HashSet, LinkedHashSet
		*/
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Satu");
		ll.add("Dua");
		ll.set(0, "Ganti dari list 1");
		
		Iterator<String> itr = ll.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}