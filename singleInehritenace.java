public class singleInehritenace {

    public static void main(String[] args) {

        Child c1= new  Child();
        c1.disp();
        c1.display();

    }
}


    class Parent{
        int x=10;
        void display(){
            System.out.println("Perent class");
        }
    }

    class Child extends Parent{
        void disp(){
        System.out.println("Child class");
        System.out.println("value of x :"+x);
    }
}
