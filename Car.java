





    class Features{
        int speed=240;
        int price=1000000;
         int add ;
        void display(){
            add=speed+price;
        }
    }

    public class Car {
    public static void main(String[] args) {
        
        Features f1 = new Features ();
         System.out.println(f1.speed);
         System.out.println(f1.price);
         f1.display();
         System.out.println(f1.add);
    }
}
    
