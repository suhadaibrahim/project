package Biodata;
public class CGPA {
    double gpa[] = {2.89,2.59};
	double sum=0;
	double finalcgpa = 0;
	
	

	public void printGPA() {
		
		
		System.out.println("\nGPA and Final CGPA\n");
		
		System.out.println("Sem 1: "  +gpa[0]);
		System.out.println("Sem 2: "  +gpa[1]);
		System.out.println("\n");
		}
	
	public double calculateCGPA() {
		for(int i =0; i <gpa.length; i++) {
			
			//sum+=gpa[i];
			sum= sum+gpa[i];
		}
		
		finalcgpa = sum/gpa.length;
		return finalcgpa;
		
	}
    
}
