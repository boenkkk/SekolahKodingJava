package pCollectionStackNDequeue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Stack;

public class aa {
	
	public static void main(String[] args){
		
		// Stack : LIFO, Dequeue : LIFO
//		Stack<String> nama = new Stack<String>();
		ArrayDeque<String> nama = new ArrayDeque<String>();
		
		nama.push("Budi");
		nama.push("Boenk");
		nama.push("Santoso");
		
//		nama.pop();
		nama.peek();
		
		Iterator<String> iterator = nama.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
	
}
