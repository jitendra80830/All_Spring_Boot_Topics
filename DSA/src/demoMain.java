class A{
    static int x=10;
    public static void show(){
        System.out.println("parent class :"+x);
    }
}

class B extends A
{
    static int x=5;
    public static void show(){
        System.out.println("child class :"+x);
    }
}

public class demoMain {

    public static void main(String[] args) {

        A.show();

       A a1=new B();
        a1.show();

    }
}
