 
import java.util.Scanner;
 public class Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size");
        int n =sc.nextInt();
        int[] x=new int[n];
        for(int i=0; i<x.length; i++){
            System.err.println("Enter element of array");
            x[i]=sc.nextInt();
        }
        for(int i=0; i<x.length; i++)
        {
             System.out.println(x[i]);
        }
        sc.close();
    }

    
}
 
         
      

