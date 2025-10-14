interface Cat1 {
    int x = 100;
}

interface Cat2 {
    int y = 200;
}

interface Cat extends Cat1, Cat2 {
    void eat();
}

class Sum implements Cat {
    public void sleep() {
        System.out.println("value of x & y:" +  x  + " & "  + y);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Sum r = new Sum();
        r.sleep();
    }
}
