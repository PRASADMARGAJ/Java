interface Animal {
    int x=10;
    int y=20;
    void eat();
    void sleep();
}

class Dog implements Animal {
    public void eat() {
        System.out.println(x);
        
    }
    
    public void sleep() {
        System.out.println(y);
        
    }
}


public class Interface {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.eat();
        myDog.sleep();
    }
    }

    

