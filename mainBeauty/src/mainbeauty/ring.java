package mainbeauty;
public class ring extends metals {
	String type1,type2,type3,type4,type5  ;
	ring(){
		this.type1="Wedding Ring";
		this.type2="Birthstone Ring";
		this.type3="Promise Ring";
		this.type4="Moissanite Ring";
		this.type5="Class Ring";
	}
	public void ring() {
		System.out.println("Type 1: "+type1+ "\nType 2: "+type2+"\nType 3: "+type3+"\nType 4: "+type4+"\nType 5: "+type5);
	}
   void run() {
	   System.out.println("\nLet the Stones talk about You!!!");
	   super.run();   
   }

}