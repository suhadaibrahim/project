package assignment2;
import static java.lang.Integer.sum;

public class Assignment2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        treatment t = new treatment();
        System.out.println("The Treatment is the best service");
        t.gender();
        System.out.println("\nType of treatment.");
        t.type1();
        t.type2();
        t.type3();
        t.type4();
        System.out.println("\nala carte price per treatment include service RM" + sum (50,15));
        t.printspaAndSalon();
        t.run();
  
        
    }

    
     
}