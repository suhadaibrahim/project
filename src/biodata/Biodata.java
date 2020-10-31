package Biodata;

public class Biodata {

	String name = "Siti Norsuhada";
	String gender = "Female";
	String birthday = "14 March 1999";
	int age = 21;
	String citizenship = "Malaysian";
	String marital_status = "Single";
	String address = "No 12-1-2 jalan 3/112A Taman Bukit Angkasa Pantai Dalam 59200 KL";
	String hp = "0176454651";
	
		public void printBiodata(){
			
			System.out.println("Name: "+name);
			System.out.println("Gender: "+gender);
			System.out.println("Date of Birth: "+birthday);
			System.out.println("Age: "+age);
			System.out.println("Citizenship: "+citizenship);
			System.out.println("Marital Status: "+marital_status);
			System.out.println("Address: "+address);
			System.out.println("No HP: "+hp);
		}
}