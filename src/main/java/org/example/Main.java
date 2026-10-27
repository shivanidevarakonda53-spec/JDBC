import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public  static void main(String[] args) {
        try {
            Connection cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc",
                    "root",
                    "root"
            );

            System.out.println("data base connected");
            Statement stmt = cn.createStatement();

            String sql = "INSERT INTO new_table(name,salary) VALUES('John',70000)";
            stmt.executeUpdate(sql);
            System.out.println("employe inserted successfully!");


        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}