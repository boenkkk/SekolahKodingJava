package kInputScanner;

import java.util.Scanner;

public class aa {
	private static Scanner scan;

	public static void main(String[] args){
		scan = new Scanner(System.in);
		
		System.out.println("Namanya siapa?");
		String nama = scan.nextLine();
		
		System.out.println("Umurnya berapa?");
		int umur = scan.nextInt();
		
		System.out.println("Hallo "+nama);
		System.out.println("Umur "+umur);
	}

}
