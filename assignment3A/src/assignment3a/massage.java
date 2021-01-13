package assignment3a;

import java.util.Scanner;

public class massage {
    String type1,type2,type3,type4,type5;
    String sum;
    int x,y;

    massage(){
        this.type1 = "swedish massage therapy";
        this.type2 = "aromatherapy massage";
        this.type3 = "hot stone massage";
        this.type4 = "reflexology";
        this.type5 = "sport massage";

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

   // void gender(){
      //  Scanner scan = new Scanner(System.in);
       // System.out.println("Enter the gender: ");
      //  String g = scan.next();
   // }
    public static int sum(int x,int y){
        return y + x;
    }
    public static void main(String [] args){
            System.out.println(sum(50,15));
        }
}
