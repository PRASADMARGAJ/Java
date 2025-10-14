public class SuperMethods {
    public static void main(String[] args) {
        // Lion l=new Lion();
        // l.show();
        Child1 c1=new Child1();
        // c1.show();

    }
}
// class Tiger{
// int x =10;
// }

// class Lion extends Tiger{
// int x=100;
// void  show(){
// System.out.println("Vlaue of x:" +x);     
// System.out.println("Vlaue of x:" +super.x); 
// }
// }
class Parent1{
    Parent1(){
    System.out.println("Perent class");
}
}
class  Child1 extends Parent1{
 Child1(){
    System.out.println("Child class");
}
}
