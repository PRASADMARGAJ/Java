import java.util.Arrays;

public class Q1classroom {
    public static void main(String[] args) {
        int [] x={10,20,3,4,60,5,7,9};

        // Find out evan and odd number
    //    for (int num : x) {
    //         if (num % 2 == 0) {
    //             System.out.println(num + " is Even");
    //         } else {
    //             System.out.println(num + " is Odd");
    //         }

            // find out maximum number
        // int max =0;
        // for(int i=0; i<x.length; i++){
        //     if(x[i]>max){
        //         max=x[i];
        //     }
        // }
        //  System.out.println("Maximum number :" +max);
               
        //      System.out.println();



            //  reverse an array

        
 
        // int[] reversed = new int[x.length];

        // for (int i = 0; i < x.length; i++) {
        //     reversed[i] = x[x.length - 1 - i];
        // }

        // System.out.println("Original Array: " + Arrays.toString(x));
        // System.out.println("Reversed Array: " + Arrays.toString(reversed));


        // find the second highest number
       
         int  min=0;
         int max=0;
         for(int j=0; j<x.length; j++){
            if(x[j]>max){
                max=x[j];
            }
         }
         for (int i=0; i<x.length;i++){
            if(x[i]> max){
             max=x[i];
             min=max;

            }else if(x[i]>min && x[i]!=max){
                min=x[i];

            }
         }
         System.out.println("Largeast number :"+max);
         System.out.println("Second :"+min);

    }

}
