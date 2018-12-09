package iPolymorphism;

public class hewan {
	void suara(){
		System.out.println("Suara Hewan");
	}
}

class kucing extends hewan {
	void suara(){
		System.out.println("Suara Kucing");
	}
}

class anjing extends hewan{
	void suara(){
		System.out.println("Suara Anjing");
	}
}