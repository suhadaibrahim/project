package Biodata;
public class profil {

	public static void main(String[] args) {
		

		System.out.println("My Resume\n");
		
		Biodata b = new Biodata();
		workExperience w = new workExperience();
		workSkill s = new workSkill();
		talent t = new talent();
		CGPA c = new CGPA();
		
		
		
		
		b.printBiodata();
		w.printworkExperience();
		s.printworkSkill();
		t.printtalent();
		c.printGPA();
		 
		System.out.println("Final CGPA: "+c.calculateCGPA());
	}
	
}
