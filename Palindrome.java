public class Palindrome {
      public static void main(String[] args) {
        int num = 11;   
        int rev = 0, rem;
        int temp = num;

        while (temp != 0) {
            rem = temp % 10;        
            rev = rev * 10 + rem;  
            temp = temp / 10;      
        }

        if (num == rev) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is Not Palindrome");
        }
    }
}
