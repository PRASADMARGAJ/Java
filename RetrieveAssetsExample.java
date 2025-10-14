import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveAssetsExample {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/asset_db";
        String user = "root";          // replace with your DB username
        String password = "password";  // replace with your DB password

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            conn = DriverManager.getConnection(url, user, password);

            // Create statement
            stmt = conn.createStatement();

            // Execute query
            String sql = "SELECT assetId, assetName, purchaseDate, cost FROM assets";
            rs = stmt.executeQuery(sql);

            // Display header
            System.out.printf("%-10s %-20s %-15s %-10s%n", "AssetID", "Asset Name", "Purchase Date", "Cost");
            System.out.println("---------------------------------------------------------------");

            // Iterate through ResultSet and display records
            while (rs.next()) {
                int id = rs.getInt("assetId");
                String name = rs.getString("assetName");
                String date = rs.getString("purchaseDate");
                double cost = rs.getDouble("cost");

                System.out.printf("%-10d %-20s %-15s %-10.2f%n", id, name, date, cost);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error.");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
