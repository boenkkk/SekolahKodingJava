package oCollectionQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class aa {
	public static void main(String[] args){
		// Queue = Collection FIFO
		PriorityQueue<String> nama = new PriorityQueue<String>();
		nama.add("Budi");
		nama.add("Boenk");
		nama.add("Santoso");
		System.out.println("--peek : "+nama.peek()+"--"); // intip data pertama, pas di iterator data pertama ga ilang
//		System.out.println("--poll : "+nama.poll()+"--"); // intip data pertama, pas di iterator data pertama ilang
		Iterator<String> iterator = nama.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
