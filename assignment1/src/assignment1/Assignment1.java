package assignment1;

import static java.lang.Integer.sum;

public class Assignment1 {

    public static void main(String[] args) {
        massage m = new massage();
        System.out.println("The Treatment is the best service");
        m.gender();
        System.out.println("\nType of treatment.");
        m.type1();
        m.type2();
        m.type3();
        m.type4();
        System.out.println("\nala carte price per treatment include service RM" + sum (50,15));
        m.printspaAndSalon();
        m.run();

    }
     
}
