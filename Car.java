package week1.day1;

public class Car {
	public void applybreak() {
		System.out.println("applyingthe break");
	}
	public void applygear() {
		System.out.println("applying the gear");
	
	}
	public void switchonac() {
		System.out.println("switchonac");
		
	}
	public void applyaccelerate() {
		System.out.println("applyaccelerate");
		
	}
		
	

	public static void main(String[] args) {
		Car audi=new Car();
		audi.applybreak();
		audi.applygear();
		audi.switchonac();
		audi.applyaccelerate();
		
		

	}

}
