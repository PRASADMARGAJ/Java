
class Model {
    String model = "BMWX5";
    String color;
    int year;

    void carinfo() {
        System.out.println("model of car: " + model + "color of car: " + color + "lonach year :" + year);
    }
}

public class Vehic {
    public static void main(String[] args) {
        Model m1 = new Model();

        m1.color = "Red";
        m1.year = 2025;

        System.out.println("model of car is: " + m1.model);
        System.out.println("color of the car:" + m1.color);
        System.out.println("lonch year :" + m1.year);
    }
}
