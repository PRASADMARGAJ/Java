public class ParemeterConstraucterOverRiading {
    public Static void main(String[]args)
    Child6 c=new Child6();
    
}
class Parent5{
    Parent5(int x , String S){
    System.out.println("Perent class :"+x);
}
}
class  Child6 extends Parent5{
 Child6(int y){
    super(10,"Hello");

    System.out.println("Child class:" +y);
}
}