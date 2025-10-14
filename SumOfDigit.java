public class SumOfDigit {

    // static int sumDigits(int n) {
    //     if (n == 0)
    //         return 0;
    //     return (n % 10) + sumDigits(n / 10);
    // }

    // public static void main(String[] args) {
    //     int num = 9876;
    //     System.out.println("Sum of digits = " + sumDigits(num));
    // }
    

    static int reverse(int n, int rev) {
        if (n == 0)
            return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        int num = 987654321;
        int reversed = reverse(num, 0);
        System.out.println("Reversed number = " + reversed);
    }
}




