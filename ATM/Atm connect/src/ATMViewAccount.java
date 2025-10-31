import java.sql.*;
import java.util.Scanner;

public class ATMViewAccount {

    static Connection con;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/prac";
        String username = "root";
        String password = "root";

        con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Successful!");

        System.out.print("Enter your Account Number: ");
        String accountNumber = scanner.next();

        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();

        if (authenticate(accountNumber, pin)) {
            viewAccount(accountNumber);
        } else {
            System.out.println("Invalid Account Number or PIN!");
        }
    }

    public static boolean authenticate(String accountNumber, int pin) throws SQLException {
        String query = "SELECT * FROM atm_users WHERE account_number=? AND pin=?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, accountNumber);
        pst.setInt(2, pin);
        ResultSet rs = pst.executeQuery();
        return rs.next();
    }

    public static void viewAccount(String accountNumber) throws SQLException {
        String query = "SELECT account_number, name, balance FROM atm_users WHERE account_number=?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, accountNumber);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            System.out.println("\n===== Account Details =====");
            System.out.println("Account Number: " + rs.getString("account_number"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Balance: " + rs.getDouble("balance"));
        } else {
            System.out.println("Account not found!");
        }
    }
}
