package mainbeauty;
public class Bracelet extends metals {
	String type1,type2,type3,type4,type5  ;
	Bracelet(){
		this.type1="Bangle Bracelets";
		this.type2="Chain Bracelet";
		this.type3="Charm Bracelets";
		this.type4="Designer Bracelets";
		this.type5="Beaded Bracelets";
	}
	public void bracelet() {
		System.out.println("Type 1: "+type1+ "\nType 2: "+type2+"\nType 3: "+type3+"\nType 4: "+type4+"\nType 5: "+type5);
	}
   void run() {
	   System.out.println("\nWe Offer better Stones than Infinity Stones!!!");
	   super.run(); 
   }
}
