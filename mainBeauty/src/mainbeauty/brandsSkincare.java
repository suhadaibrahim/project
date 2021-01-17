package mainbeauty;

class brandsSkincare{
    String Safi;
    String Loreal;
    String Simple;
    String Himalaya;
    String Biore;
    private String types = "Types of skincare: Oily, Dry, Combination";
    private String howUsing = "Step using skincare : 1:Cleansing your face 2:put the toner 3:put the
    moisturing 4:put the serum";
    public brandsSkincare(String pack1, String pack2, String pack3, String pack4, String pack5) {
    this.Safi = pack1;
    this.Loreal = pack2;
    this.Simple = pack3;
    this.Himalaya = pack4;
    this.Biore = pack5;
  }

    brandsSkincare(String safi, String loreal, String simple, String himalaya, String biore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setString(String pack1, String pack2, String pack3, String pack4, String pack5) {
    this.Safi = "Cleansing + moisturing + serum + toner";
    this.Loreal = "Mosituring + serum";
    this.Simple = "Cleansing+ toner + moisturing + serum";
    this.Himalaya = "Cleansing + moisturing";
    this.Biore = "Toner + moisturing";
  }
    public String getStringOne() {
    return Safi;
  }
    public String getStringTwo() {
    return Loreal;
  }
    public String getStringThree() {
    return Simple;
  }
    public String getStringFour() {
    return Himalaya;
  }
    public String getStringFive() {
    return Biore;
  }

     public String getTypes(){
    return types;
  }
    public void setRadio(String mytype){
    this.types = mytype;
  }
    public String getUsingSkincare(){
    return howUsing;
  }
    public void sethowUsing(String mystepSkincare){
    this.howUsing = mystepSkincare;
  }
}
