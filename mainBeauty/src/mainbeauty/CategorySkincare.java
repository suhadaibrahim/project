package mainbeauty;

class CategorySkincare  {
    String cleansing;
    String moisturing;
    String serum;
    String toner;
    private String place = "Place to buy skincare: Watson, Guardian, Farmasi";
    CategorySkincare(String cleansing, String moisturing, String serum, String toner) {
    this.cleansing = "w";
    this.moisturing = "a";
    this.serum = "s";
    this.toner = "t";
  }

    CategorySkincare(String cleansing, String moisturing, String serum, String toner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void CategorySkincare(String cleansing, String moisturing, String serum, String toner) {
    this.cleansing = "Safi,Simple,Loreal,Biore";
    this.moisturing = "cream, gel";
    this.serum = "dry, oily, combination";
    this.toner = "Simple, Safi, Loreal, Biore";
  }
    public void getcleansing(String cleansing){
    this.cleansing = cleansing;
  }

    public void getmoisturing(String moisturing){
    this.moisturing = moisturing;
  }
    public void getserum(String serum){
    this.serum = serum;
  }
    public void gettoner(String toner){
    this.toner = toner;
  }
    public String getcleansing(){
    return cleansing;
  }
    public String getmoisturing(){
    return moisturing;
  }
    public String getserum(){
    return serum;
  }
    public String gettoner(){
    return toner;
  }
    public String getplace(){
    return place;
  }
    public void sethowUsing(String myplaceBuy){
    this.place = myplaceBuy;
  }
 @Override
    public String toString(){
    return cleansing + moisturing + serum + toner;
 }
}

