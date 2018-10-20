package aTest;

import java.util.Scanner;

public class test {
	public static void main(String[] args){
		System.out.println("Hello");
		
		float a = 17.94f;
		double b = 12.12;
		System.out.println(a+ " dan " +b);
		System.out.println("-----------------");
		
		int[][] arrx;
        arrx = new int[2][2];
        arrx[0][0] = 1;
        arrx[0][1] = 2;
        arrx[1][0] = 3;
        arrx[1][1] = 4;
        System.out.println("Nilai array 0,0 : " + arrx[0][0]);
        System.out.println("Nilai array 0,1 : " + arrx[0][1]);
        System.out.println("Nilai array 1,0 : " + arrx[1][0]);
        System.out.println("Nilai array 1,1 : " + arrx[1][1]);

        // Cara 2
        int[][] arry = {{4, 3}, {2, 1}};
        System.out.println("Nilai array 0,0 : " + arry[0][0]);
        System.out.println("Nilai array 0,1 : " + arry[0][1]);
        System.out.println("Nilai array 1,0 : " + arry[1][0]);
        System.out.println("Nilai array 1,1 : " + arry[1][1]);
        System.out.println(arry[0][0] + arry[0][1]);
        
        System.out.println("-----------------");
        // deklarasi
        Double luas;
        int alas, tinggi;

        // mebuat scanner baru
        Scanner baca = new Scanner(System.in);

        // Input
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.print("Input alas: ");
        alas = baca.nextInt();
        System.out.print("Input tinggi: ");
        tinggi = baca.nextInt();

        // proses
        luas = Double.valueOf((alas * tinggi) / 2);

        // output
        System.out.println("Luas = " + luas);
	}
}
