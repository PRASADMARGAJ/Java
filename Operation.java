class Sum{
    int x=10;
    int y =20;
    int total;
    void add(){
        total =x+y;
        System.out.println("Addation is " +total);
    }
}
class ParematerSum{
    void  add1(int x, int y){
        int p=x;
        int q=y;
        int total =p+q;
        System.out.println("Sum is "+ total);
    }
}

class ParematerSumReturn{
    int add2(int x, int y){
        int p=x;
        int q=y;
        int total=p+q;
        return total;
    }
}
public class Operation {
    public  static  void main(String[]args){
        Sum s1 = new Sum();
        s1. add();


        ParematerSum a1=new ParematerSum();
        a1.add1(20,30);

        
        // int r = a1.add2(30,40);
        // System.out.println("r");
    }
}
