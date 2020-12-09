package abstraction;

abstract class bank{
    abstract void balance();
}

class bankA extends bank{
    void balance(){
        System.out.println("Balance Bank A is 100");
    }
}

class bankB extends bank{
    void balance(){
        System.out.println("Balance Bank B is 150");
    }
}

class bankC extends bank{
    void balance(){
        System.out.println("Balance bank C is 200");
    }
}

public class exercise4Abs {
    public static void main(String [] args){
        bankA a = new bankA();
        a.balance();
        bankB b = new bankB();
        b.balance();
        bankC c = new bankC();
        c.balance();
    }
    
}
