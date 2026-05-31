import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertUpdateJDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root";

        try {

            Connection con =
                    DriverManager.getConnection(url,user,password);

            String insert =
                    "INSERT INTO students(name) VALUES(?)";

            PreparedStatement ps =
                    con.prepareStatement(insert);

            ps.setString(1, "Dharaneesh");

            ps.executeUpdate();

            String update =
                    "UPDATE students SET name=? WHERE id=?";

            PreparedStatement ps2 =
                    con.prepareStatement(update);

            ps2.setString(1, "Karthik");
            ps2.setInt(2, 1);

            ps2.executeUpdate();

            System.out.println("Insert & Update Successful");

            con.close();

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
