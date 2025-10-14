class model{
        static String model = "Ford";
       static int year;
    void  carinfo(){
        System.out.println("model of car: " + model +"lonch in year: " + year);
    }
}


public class Car1 {
    public static void main(String[]args){
        model m1 = new model();
         model m2 = new model();
          model m3 = new model();
         m1.model ="Bmw";
         m2.model="Ferari";
         m3.model="Volvo";
        m1.year=2025;
         m2.year=2026;
          m3.year=2027;
       

          System.out.println("model of car is: " + m1.model);
          System.out.println("lonch year :" + m1.year);
          System.out.println("model of car is: " + m2.model);
          System.out.println("lonch year: " + m2.year);
          System.out.println("model of car is: " + m3.model);
          System.out.println("lonch year: " + m3.year);
    }
}
