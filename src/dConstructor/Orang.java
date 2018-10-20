package dConstructor;

public class Orang {
	
	int tinggi;
	String kerjaan;
	
	public Orang(int nTinggi, String nKerjaan){
		this.tinggi = nTinggi;
		this.kerjaan = nKerjaan;
	}
	
	public static void main(String[] args){
		int nTinggi = 180;
		String nKerjaan = "Programmer";
		Orang budi = new Orang(nTinggi, nKerjaan);
		
		System.out.println("Tinggi : " +budi.tinggi);
		System.out.println("Kerjaan : " +budi.kerjaan);
	}
	
}