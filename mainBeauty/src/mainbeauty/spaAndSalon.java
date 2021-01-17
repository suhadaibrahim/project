package mainbeauty;
public class spaAndSalon {
    String alacarte,pack1,pack2,pack3,pack4,pack5;


    spaAndSalon(){
        this.alacarte = "choose one";
    }
    spaAndSalon(String pack1){
        this.pack1 = "Express mani pedi + spa facial + shoulder&foot massage";
        this.pack2 = "Ecalp treatment for hair loss + spa facial";
        this.pack3 = "Manicure pedicure/full body massage + facial";
        this.pack4 = "Hair treatment + hair cut";
        this.pack5 = "Full body massage + facial + mani pedi";
    }
    public void printspaAndSalon(){
        spaAndSalon obj1 = new spaAndSalon();
        spaAndSalon obj2 = new spaAndSalon("Express mani pedi + spa facial + shoulder&foot massage");
        spaAndSalon obj3 = new spaAndSalon("Ecalp treatment for hair loss + spa facial");
        spaAndSalon obj4 = new spaAndSalon("Manicure pedicure/full body massage + facial");
        spaAndSalon obj5 = new spaAndSalon("Hair treatment + hair cut");
        spaAndSalon obj6 = new spaAndSalon("Full body massage + facial + mani pedi");

        System.out.println("\nalacarte: " + obj1.alacarte +  "\npackage: " + obj2.pack1 + "\nRM59");
        System.out.println("alacarte: " + obj1.alacarte +  "\npackage: " + obj3.pack2 + "\nRM99");
        System.out.println("alacarte: " + obj1.alacarte +  "\npackage: " + obj4.pack3 + "\nRM199");
        System.out.println("alacarte: " + obj1.alacarte +  "\npackage: " + obj5.pack4 + "\nRM99");
        System.out.println("alacarte: " + obj1.alacarte +  "\npackage: " + obj6.pack5 + "\nRM279");
    }
    
}

