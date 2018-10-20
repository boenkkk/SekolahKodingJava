package bObjek;

public class Orang {
	
	int tinggi;
	String kerjaan = "Teknisi";
	
	public static void main(String[] args){
		Orang budi = new Orang();
		budi.jalan("kedepan", 5);
		
		String kerjaan1 = budi.asal();
		System.out.println("Kerjaannya : " +kerjaan1);
	}
	
	public void jalan(String kemana, int langkah){
		System.out.println("Jalan " +kemana);
		System.out.println("Berapa langkah "+langkah);
	}
	
	public String asal(){
		String kerjaan = "Programmer";
		return kerjaan;
	}
	
}