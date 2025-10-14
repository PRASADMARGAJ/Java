public class myArray1 {
    public static void main(String[] args) {

        int[] num={1,2,3,4,5};
    String[] str={"Apple","Mango","Grapess"};
    Boolean[]bool={true,false};
    double[]db={10.36,15.25,15.36};
    Object[]obj={100,"apple",true,12.3564};


        
       for(int i:num){
        System.out.println(i);
       }

        for(String i:str){
        System.out.println(i);
       }

        for(Boolean i:bool){
        System.out.println(i);
       }
        for(double i:db){
        System.out.println(i);
       }

        for(Object i:obj){
        System.out.println(i);
       }
}
}