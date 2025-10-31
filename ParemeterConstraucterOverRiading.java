public class ParemeterConstraucterOverRiading {
    public static void main(String[] args) {
        Child6 c = new Child6(20); // Pass an integer
    }
}

class Parent5 {
    Parent5(int x, String s) {
        System.out.println("Parent class: " + x);
    }
}

class Child6 extends Parent5 {
    Child6(int y) {
        super(10, "Hello");
        System.out.println("Child class: " + y);
    }
}
