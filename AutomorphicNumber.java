public class AutomorphicNumber {
    static boolean isAutomorphic(int n) {
        int square = n * n;
        
        // Convert both to string to check ending
        String numStr = String.valueOf(n);
        String squareStr = String.valueOf(square);

        return squareStr.endsWith(numStr);
    }

    public static void main(String[] args) {
        int num = 6;

        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is NOT an Automorphic number.");
        }
    }
}
