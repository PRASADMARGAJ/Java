
import java.util.Scanner;

public class ChareacterArray {
    public static void main(String[] args) {
        char []arr ={'H','E','L','L','O','P','R','A','S','A','D'};
        char [][] x= {{'a','b','c'},{'p','q','r'},{'x','y','z'}};
        for(int i =0; i<arr.length;i++){
            System.out.println("Chareactor at Index" + i + "is :"+arr[i]);
        }
    

  
    // char[][] x= new char[2][2];
    // Scanner sc=new  Scanner(System.in);


    for(int i=0; i <x.length; i++){

        for (int j=0;j<x[0].length;j++){
            System.out.print( x[i][j]+ " ");
            
        }
      System.out.println();
    }

}
}
