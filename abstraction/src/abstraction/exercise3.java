package abstraction;

abstract class Parents{
    abstract void message();
    public void print(){
        System.out.println("message");
    }
}

class Y extends Parents{
    public void message(){
        System.out.println("This is first subclass");
    }
}

class Z extends Parents{
    @Override
    public void message(){
        System.out.println("This is second subclass");
    }
}

public class exercise3{
    public static void main(String[]args){
        Y a = new Y();
        a.message();
        Z b = new Z();
        b.message();
        
    }
}