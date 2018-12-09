package mCollectionLinkedList;

import java.util.*;

public class aa {
	public static void main(String[] args){
		/*
		 Collection
		 	List -> ArrayList, LinkedList
		 	Queue
		 	Set -> HashSet, LinkedHashSet
		*/
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Satu");
		//ll.add("Dua");
		//ll.removeAll(ll);
		
		Iterator<String> itr = ll.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}