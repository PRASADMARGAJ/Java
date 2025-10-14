class ConstructorOverload {

    public static void main(String[] args) {
        ConstructorOverload op = new ConstructorOverload();
        op.add(10);
        op.add(10, 20);
        op.add(10.5f, 20);  
    }

    void add(int a) {
        System.out.println("Enter a value is: " + a);
    }

    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    void add(float a, int b) {
        float mul = a * b;
        System.out.println("Multiplication is: " + mul);
    }
}
