package gInnerclass;

class luar{
	private int x = 10;
	
	class dalam{
		void hasil(){
			System.out.println("Nilai x : " +x);
		}
	}
	
	void tampil(){
		dalam d = new dalam();
		d.hasil();
	}
}
public class coba {
	public static void main(String args[]){
		luar l = new luar();
		l.tampil();
	}
}
