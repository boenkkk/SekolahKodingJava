package lCollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class bb {
	public static void main(String[] args){
		/*
		 Collection
		 	interface -> set, list, queue
		 	kelas -> vector, linkedlist, hash, arrayList
		*/
		//ArrayList al = new ArrayList(); //non-generic
		ArrayList<String> al2 = new ArrayList<String>(); //generic
		
		String[] nama = new String[]{"Budi","Santoso"};
		al2.addAll(Arrays.asList(nama));
		//al2.remove("Budi");
		
		// print cara 1
		for(String nama1 : al2){
			System.out.println(nama1);
		}
		
		System.out.println("--------------------------------");
		
		// print cara 2
		Iterator<String> it = al2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}