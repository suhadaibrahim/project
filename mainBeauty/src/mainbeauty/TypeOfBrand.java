package mainbeauty;

    public abstract class TypeOfBrand {
    String DKNY, CK, VictoriaSecret, Givenchy, Bulgari, HugoBoss;

    public void setMakeup(String pDKNY, String pCK, String pVictoriaSecret, String
    pGivenchy, String pBulgari, String pHugoBoss){
    DKNY = pDKNY;
    CK = pCK;
    VictoriaSecret= pVictoriaSecret;
    Givenchy = pGivenchy;
    Bulgari = pBulgari;
    HugoBoss=pHugoBoss;
 }
    public String getDkny(){
    return DKNY;
 }
    public String getCK(){
    return CK;
 }
    public String getVictoriaSecret(){
    return VictoriaSecret;
 }
    public String getGivenchy(){
    return Givenchy;
 }
    public String getBulgari(){
    return Bulgari;
 }
    public String getHugoBossy(){
    return HugoBoss;
 }
    void priceOfPerfume(){
    System.out.println("Price: ");
 }
    void onlineShop(){
    System.out.println("You can buy it: ");
 }
}