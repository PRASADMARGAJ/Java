

public class LeapYear {
     public static void main(String[] args) {
        

        System.out.print("Enter a year: ");
        int year = 2010;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year ✅");
        } else {
            System.out.println(year + " is NOT a Leap Year ❌");
        }
    }
}
