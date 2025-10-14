   class MultiLevelInheritance{
    public static void main(String[] args) {

        G c1= new  G();
        c1.disp();
        c1.display();
        c1.show();
    }
}


    class P{
        int x=10;
        void display(){
            System.out.println("Perent class");
        }
    }

    class C extends P{
        int y=20;
        void disp(){
        System.out.println("Child class");
        System.out.println("value of x :"+x);
    }
}

class G extends C{
    void show(){
     System.out.println("GrandChild class");
     System.out.println("Value of x:"+x);
     System.out.println("Value of y:"+y);
}
}