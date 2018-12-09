package lCollectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class aa {
	public static void main(String[] args){
		/*
		 Collection
		 	interface -> set, list, queue
		 	kelas -> vector, linkedlist, hash, arrayList
		*/
		//ArrayList al = new ArrayList(); //non-generic
		ArrayList<String> al2 = new ArrayList<String>(); //generic
		
		al2.add("Budi");
		al2.add("Santoso");
		al2.add("Keren");
		
		// print cara 1
		for(String nama : al2){
			System.out.println(nama);
		}
		
		System.out.println("--------------------------------");
		
		// print cara 2
		Iterator<String> it = al2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}