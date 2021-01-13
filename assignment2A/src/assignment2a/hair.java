package assignment2a;

public class hair extends spaAndSalon{
     String type1,type2,type3,type4,type5;
   

    hair(){
        this.type1 = "cutting";
        this.type2 = "colouring";
        this.type3 = "rebonding";
        this.type4 = "stylist";
        this.type5 = "washing";

    }


    void type1() {
        System.out.println("Type Treatment " + type1);
    }

    void type2() {
        System.out.println("Type Treatment " + type2);
    }

    void type3() {
        System.out.println("Type Treatment " + type3);
    }

    void type4() {
        System.out.println("Type Treatment " + type4);
    }
    
    void type5(){
        System.out.println("Type Treatment " + type5);
    }

    void run(){
        System.out.println("This treatment is a good one for health");
    }

    
}
