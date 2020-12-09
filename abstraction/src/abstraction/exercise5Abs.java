package abstraction;

abstract class result{
    abstract void percentage();
}

class first extends result{
    double percentage;
    double result1;
    double result2;
    double result3;
    
    first( double r1, double r2, double r3){
        this.result1 = r1;
        this.result2 = r2;
        this.result3 = r3;
    }
    @Override
    void percentage(){
        percentage = (result1 + result2 + result3)/300*100;
        System.out.println("class first percentage of result for student: " +percentage+ "%");
    }
}
class second extends result{
    double percentage;
    double result1;
    double result2;
    double result3;
    double result4;
    
    second( double r1, double r2, double r3, double r4){
        this.result1 = r1;
        this.result2 = r2;
        this.result3 = r3;
        this.result4 = r4;
    }
    @Override
    void percentage(){
        percentage = (result1 + result2 + result3 + result4)/300*100;
        System.out.println("class second percentage of result for student: " +percentage+ "%");
    }
}
public class exercise5Abs {
    public static void main(String []args){
        first a = new first(40,55,80);
        a.percentage();
        second b = new second(49,78,90,54);
        b.percentage();
    }
}
