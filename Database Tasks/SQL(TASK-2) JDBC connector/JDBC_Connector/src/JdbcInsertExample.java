import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertExample
{
    public static void main(String[] args)
    {
        //Database credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/employee_db";
        String username = "root";
        String password = "Ranjithmani@564";

        //SQL insert query
        String insertQuery = "INSERT INTO Employee (emp_code, emp_name, emp_age, emp_sal) VALUES (?, ?, ?, ?)";
        try{
            // 1. Load and register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // 3. Create a PreparedStatement for the insert query
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // 4. Insert data into the table

            // First row
            //emp_code
            preparedStatement.setInt(1,101);
            //emp_name
            preparedStatement.setString(2,"Jenny");
            //emp_age
            preparedStatement.setInt(3,25);
            //emp_sal
            preparedStatement.setInt(4,10000);
            preparedStatement.executeUpdate();

            // Second row
            //emp_code
            preparedStatement.setInt(1,102);
            //emp_name
            preparedStatement.setString(2,"Jacky");
            //emp_age
            preparedStatement.setInt(3,30);
            //emp_sal
            preparedStatement.setInt(4,20000);
            preparedStatement.executeUpdate();

            // Third row
            //emp_code
            preparedStatement.setInt(1,103);
            //emp_name
            preparedStatement.setString(2,"Joe");
            //emp_age
            preparedStatement.setInt(3,20);
            //emp_sal
            preparedStatement.setInt(4,40000);
            preparedStatement.executeUpdate();

            // Fourth row
            //emp_code
            preparedStatement.setInt(1,104);
            //emp_name
            preparedStatement.setString(2,"John");
            //emp_age
            preparedStatement.setInt(3,40);
            //emp_sal
            preparedStatement.setInt(4,80000);
            preparedStatement.executeUpdate();

            // Fifth row
            //emp_code
            preparedStatement.setInt(1,105);
            //emp_name
            preparedStatement.setString(2,"Shameer");
            //emp_age
            preparedStatement.setInt(3,25);
            //emp_sal
            preparedStatement.setInt(4,90000);
            preparedStatement.executeUpdate();

            // 5.Close the connection
            preparedStatement.close();
            connection.close();

            System.out.println("Data has been inserted successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found");
        } catch (SQLException e) {
            System.out.println("Database error.");
            e.printStackTrace();
        }
    }
}
