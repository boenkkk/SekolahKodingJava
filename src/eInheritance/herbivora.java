package eInheritance;

import java.util.Scanner;

public class herbivora extends binatang{
	
	public static Scanner baca = new Scanner(System.in);
	
	public static void main(String[] args){
		herbivora kuda = new herbivora();
		
		//String jenis = "mamalia";
		System.out.print("Kuda berjenis ");
		String jenis = baca.next();
		kuda.setJenis(jenis);
		
		//String makan = "rumput";
		System.out.print("Kuda memakan ");
		String makan = baca.next();
		kuda.setMakan(makan);
		
		System.out.println("Kuda adalah jenis dari " +kuda.getJenis());
		System.out.println("Kuda memakan " +kuda.getMakan());
	}

}
