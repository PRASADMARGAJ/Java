public class HerchilcalInheritance {
    public static void main(String[] args) {

        Son s = new Son();
        D d = new D();
        s.disp();

        d.show();
    }
}

class P {
    int x = 10;

    void display() {
        System.out.println("Perent class");
    }
}

class Son extends P {
    int y = 20;

    void disp() {
        System.out.println("Son class");
        System.out.println("value of x :" + x);
    }
}

class D extends P {
    void show() {
        System.out.println("Daughter class");
        System.out.println("Value of x:" + x);
        // System.out.println("Value of y:" + y);
    }
}