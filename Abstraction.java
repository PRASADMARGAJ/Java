abstract class Bmw{
    abstract void disp();

    void Show() {
        System.out.println("Nomaral method");
    }
}

class Delta extends Bmw {
    void disp() {
        System.out.println("Abstract method of Father class");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Delta d = new Delta();
        d.disp();
        d.Show();

    }
}
