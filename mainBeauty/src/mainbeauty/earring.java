package mainbeauty;
public class earring extends metals{
	String type1,type2,type3,type4,type5  ;
	earring(){
		this.type1="Stud Earrings";
		this.type2="Drop Earrings";
		this.type3="Chandelier Earrings ";
		this.type4="Dangle Earrings";
		this.type5="Clip-on Earrings ";
	}
	public void earring() {
		System.out.println("Type 1: "+type1+ "\nType 2: "+type2+"\nType 3: "+type3+"\nType 4: "+type4+"\nType 5: "+type5);
	}
   void run() {
	   System.out.println("\nOur designs never go out of Fashion!!!");
	   super.run();  
   }
}
