package mainbeauty;
abstract class quote
{
	String frst;
	quote(String description) //constructor with parameter
	{
		this.frst=description;
	}
	
	void display() { //non abstract method
		System.out.println(frst);
	}
}

//subclass
class quote1 extends quote{
	quote1(String frst){ //constructor
		super(frst);
		
	}
}
