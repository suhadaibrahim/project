package mainbeauty;
public class necklace extends metals {
	
		String type1,type2,type3,type4,type5  ;
		necklace(){
			this.type1="Opera Necklace";
			this.type2="Multicoloured Necklace";
			this.type3="Thread Necklace";
			this.type4="Collar Necklace";
			this.type5="Princess Necklace";
		}
		public void necklace() {
			System.out.println("Type 1: "+type1+ "\nType 2: "+type2+"\nType 3: "+type3+"\nType 4: "+type4+"\nType 5: "+type5);
		}
	   void run() {
		   System.out.println("\nA perfectly designed Necklace for a perfect Women!!!");
		   super.run();  
	   }

   
	}

