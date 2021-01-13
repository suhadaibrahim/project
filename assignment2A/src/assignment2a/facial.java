package assignment2a;

public class facial extends spaAndSalon{
     String type1,type2,type3,type4,type5;
   

    facial(){
        this.type1 = "sheet masks";
        this.type2 = "clay";
        this.type3 = "cream masks";
        this.type4 = "gel masks";
        this.type5 = "charcoal masks";

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
