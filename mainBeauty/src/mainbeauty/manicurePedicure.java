package mainbeauty;
public class manicurePedicure extends spaAndSalon{
    String type1,type2,type3,type4,type5;
   

    manicurePedicure(){
        this.type1 = "regular mani and pedi";
        this.type2 = "french manicure/pedicure";
        this.type3 = "nail spa";
        this.type4 = "parafin";
        this.type5 = "stone manicure and pedicure";

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
