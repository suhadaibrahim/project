package assignment1;
import java.util.Scanner;
public class massage extends spaAndSalon{
    String type1,type2,type3,type4,type5;
    String sum;
    int x,y;
    
    massage(){
        this.type1 = "massage";
        this.type2 = "manicure pedicure";
        this.type3 = "facial";
        this.type4 = "hair";
        
    }
    
   
    void type1() {
        System.out.println("Package " + type1);
    }

    void type2() {
        System.out.println("Package " + type2);
    }

    void type3() {
        System.out.println("Package " + type3);
    }

    void type4() {
        System.out.println("Package " + type4);
    }

    void run(){
        System.out.println("This treatment is a good one for health");
    }
    
    void gender(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the gender: ");
        String g = scan.next();
    }
    public static int sum(int x,int y){
        return y + x;
    }
    public static void main(String [] args){
            System.out.println(sum(50,15));
        }
    
}
