package assignmentspaandsalon;

public class treatment {
    String pack1;
    String pack2;
    String pack3;
    String pack4;
    String pack5;

    treatment(String pack1, String pack2, String pack3, String pack4, String pack5) {
        this.pack1 = pack1;
        this.pack2 = pack2;
        this.pack3 = pack3;
        this.pack4 = pack4;
        this.pack5 = pack5;
    }

    public void setString(String pack1, String pack2, String pack3, String pack4, String pack5) {
        this.pack1 = "Express mani pedi + spa facial + shoulder&foot massage";
        this.pack2 = "Ecalp treatment for hair loss + spa facial";
        this.pack3 = "Manicure pedicure/full body massage + facial";
        this.pack4 = "Hair treatment + hair cut";
        this.pack5 = "Full body massage + facial + mani pedi";
    }

    public String getStringOne() {
        return pack1;
    }

    public String getStringTwo() {
        return pack2;
    }

    public String getStringThree() {
        return pack3;
    }

    public String getStringFour() {
        return pack4;
    }

    public String getStringFive() {
        return pack5;
    }
    
}
