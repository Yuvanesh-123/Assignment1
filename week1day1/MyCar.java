package week1day1;

public class MyCar {
		public void  Break(){
	System.out.println("apply break");	
	 
		}
		public void applyGear() {
	System.out.println("apply Gear");	
	 
		}
		public void SwitchOnAc() {
	System.out.println("Press on AC");	
	 
		}
		public void applyAcclerate() {
	System.out.println("Presss Acclerate");	
	 
		}



	
	public static void main(String[] args) {
		MyCar key=new MyCar();
		key.Break ();
		key.applyGear();
		key.applyAcclerate();
		key.SwitchOnAc();
	}

}
