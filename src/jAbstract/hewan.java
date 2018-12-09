package jAbstract;

public class hewan extends makhluk{
	public static void main(String[] args){
		makhluk m = new hewan();
		m.makan();
		m.tidur();
	}
	
	void tidur(){
		System.out.println("tidur");
	}
}
