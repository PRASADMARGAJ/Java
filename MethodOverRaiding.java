class  Fruits{
    void disp(){
        System.out.println("Father class");
    }
}
class Apple extends Fruits{
    void disp(){
        System.out.println("Son class");
        super.disp() ;
    }
}



public class MethodOverRaiding {
    public static void main(String[] args) {
        Apple s=new Apple();
        s.disp();
    }

}
