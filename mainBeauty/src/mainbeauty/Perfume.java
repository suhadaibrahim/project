package mainbeauty;

class Perfume {
    String ForMan, ForWoman;
    int price;
    
    Perfume(String ForMan, String ForWoman){
    this.ForMan = ForMan;
    this.ForWoman = ForWoman;
 }
    public void setForMan(String ForMan){
    this.ForMan = ForMan;
 }
    public void setForWoman(String ForWoman){
    this.ForWoman= ForWoman;
 }
    public String getForMan(){
    return ForMan;
 }
    public String getForWoman(){
    return ForWoman;
 }
}

