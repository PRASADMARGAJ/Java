
import java.util.Scanner;

public class information {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Enter your name.");
        name = sc.nextLine();
        System.err.println("Enter your age.");
        age =sc.nextInt();
        System.out.println("Your name is :" + name);
        System.out.println("Your age is :" + age);



        // System.err.println("Enter your age");
        // age =sc.nextInt();
        // System.out.println("Enter your name");
        // name = sc.nextLine();
        // System.out.println("Your age is" + age);
        // System.out.println("Your name is" + name);
    }

    
}
