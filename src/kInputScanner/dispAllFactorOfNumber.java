package kInputScanner;

import java.util.Scanner;

public class dispAllFactorOfNumber {
	private static Scanner scan;

	public static void main(String[] args){
		int nn, ii;
		scan = new Scanner(System.in);
		
		System.out.println("Masukan nilai : ");
		nn = scan.nextInt();
		
		System.out.println("Faktor dari " +nn+ " adalah : ");
		for (ii = 1; ii <= nn; ii++) {
			if (nn % ii == 0) {
				System.out.println(ii);
			}
		}
	}
}