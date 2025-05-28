import java.sql.*;

public class JDBCInsertUpdate {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:students.db")) {
            String insertSQL = "INSERT INTO students (id, name) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Alice");
            pstmt.executeUpdate();

            String updateSQL = "UPDATE students SET name = ? WHERE id = ?";
            pstmt = conn.prepareStatement(updateSQL);
            pstmt.setString(1, "Alice Smith");
            pstmt.setInt(2, 1);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}