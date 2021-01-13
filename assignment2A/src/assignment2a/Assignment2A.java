package assignment2a;

import static java.lang.Double.sum;

public class Assignment2A {

    public static void main(String[] args) {
        massage m = new massage();
        System.out.println("The Treatment is the best service");
        m.gender();
        System.out.println("\nType of massage treatment.");
        m.type1();
        m.type2();
        m.type3();
        m.type4();
        m.type5();
        m.printspaAndSalon();
        m.run();
        
         System.out.println("\nType of manicure pedicure treatment.");
         manicurePedicure mp = new manicurePedicure();
         mp.type1();
         mp.type2();
         mp.type3();
         mp.type4();
         mp.type5();
         mp.printspaAndSalon();
         mp.run();
         
         System.out.println("\nType of facial treatment.");
         facial f = new facial();
         f.type1();
         f.type2();
         f.type3();
         f.type4();
         f.type5();
         f.printspaAndSalon();
         f.run();
         
         System.out.println("\nType of hair treatment.");
         hair h = new hair();
         h.type1();
         h.type2();
         h.type3();
         h.type4();
         h.type5();
         h.printspaAndSalon();
         h.run();
        
    }
    
}
