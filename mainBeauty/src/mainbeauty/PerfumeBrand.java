package mainbeauty;

class PerfumeBrand {
    String Brand1, Brand2, Brand3, Brand4, Brand5, Brand6;
    public PerfumeBrand(String Brand1, String Brand2, String Brand3, String Brand4,
    String Brand5, String Brand6){
    this.Brand1 = Brand1;
    this.Brand2 = Brand2;
    this.Brand3 = Brand3;
    this.Brand4 = Brand4;
    this.Brand5 = Brand5;
    this.Brand6 = Brand6;
 }
    public void setBrand1(String Brand1){
    this.Brand1 = Brand1;
 }
    public void setBrand2(String Brand2){
    this.Brand2 = Brand2;
 }
    public void setBrand3(String Brand3){
    this.Brand3 = Brand3;
 }
    public void setBrand4(String Brand4){
    this.Brand4 = Brand4;
 }
    public void setBrand5(String Brand5){
    this.Brand5 = Brand5;
 }
    public void setBrand6(String Brand6){
    this.Brand6 = Brand6;
 }
    public String getBrand1(){
    return Brand1;
 }
    public String getBrand2(){
    return Brand2;
 }
    public String getBrand3(){
    return Brand3;
 }
    public String getBrand4(){
    return Brand4;
 }
    public String getBrand5(){
    return Brand5;
 }
    public String getBrand6(){
    return Brand6;
 }
    void sum(int base)
 {
    System.out.println("Price : " + ( base));
 }
    void run()
 {
    System.out.println("THIS PERFUME ONLY AVAILABLE FOR MAN");
 }
    void run1()
 {
    System.out.print("THIS PERFUME ONLY AVAILABLE FOR WOMAN");
 }
}

