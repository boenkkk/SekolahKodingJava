package cGetSet;

public class Orang {
	
	String kerjaan = "Teknisi";
	
	public static void main(String[] args){
		Orang budi = new Orang();
		
		String nKerjaan = "Programmer";
		budi.setKerjaan(nKerjaan);
		String kerjaanBaru = budi.kerjaan;
		
		System.out.println("Kerjaan budi sekarang : " +kerjaanBaru);
		System.out.println("--------------------------------------");
		
		Orang boenk = new Orang();
		boenk.setKerjaan(nKerjaan);
		String kerjaanBoenk = boenk.getKerjaan();
		System.out.println("Kerjaan boenk : " +kerjaanBoenk);
	}

	public String getKerjaan() {
		return kerjaan;
	}

	public void setKerjaan(String kerjaan) {
		this.kerjaan = kerjaan;
	}
	
}