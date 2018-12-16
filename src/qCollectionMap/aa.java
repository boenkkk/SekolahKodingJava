package qCollectionMap;

import java.util.*;
public class aa {
	
	public static void main(String[] args){
		// Map key-value : HashMap, LinkedHashMap, Tree
		//HashMap<Integer, String> data = new HashMap<Integer, String>(); //ngacak
		//LinkedHashMap<Integer, String> data = new LinkedHashMap<Integer, String>(); //urut sesuai input
		TreeMap<Integer, String> data = new TreeMap<Integer, String>(); //urut dati key
		
		data.put(1, "Budi");
		data.put(2, "Santoso");
		data.put(8, "Ika");
		data.put(4, "Boenk");
		data.put(16, "Koeng");
		
		// tipeData namaBaru : namaMap.entrySet()
		for(Map.Entry nama : data.entrySet()){
			System.out.println("Key : " +nama.getKey()+ ", Value : "+nama.getValue());
		}
	}

}
