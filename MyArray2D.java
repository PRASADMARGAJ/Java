import java.util.Scanner;

public class MyArray2D {
    public static void main(String[] args) 
    {
        // int[][] arr = {{100,200,300},{400,500,600},{700,800,900}};

        // for (int i=0; i<arr.length; i++)
        // {

        //     for (int j =0; j<arr[0].length; j++){

        //       System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Row number:");
        m=sc.nextInt();
        System.out.println("Enter a coloumn number:");
        n=sc.nextInt();

        int [][] arr=new int[m][n];

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[0].length;j++){
                System.out.println("Enter value at index["+i+"]["+j+"]:");

                arr[i][j]=sc.nextInt();
            }

        }
        System.out.println("Element in arry:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
