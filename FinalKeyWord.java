public class FinalKeyWord {
   
    public static void main(String[] args) {
        Avengers a=new Avengers();
        a.display();
    }
}
 class Avengers{
        final int x=10;
        void display(){
        System.out.println(x);
    }
}