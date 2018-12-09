package fOverriding;

public class karnivora extends hewan{
	//overriding
	int umur = 20;
	int getUmur(){
		//return this.umur; //20
		return super.umur; //12 override ke class hewan
	}
	
	public static void main(String args[]){
		karnivora k = new karnivora();
		System.out.println(k.getUmur());
	}
}
