import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

    public class JdbcSelectExample {
        public static void main(String[] args) {
            // Database credentials
            String jdbcURL = "jdbc:mysql://localhost:3306/employee_db";
            String username = "root";
            String password = "Ranjithmani@564";

            // SQL select query
            String selectQuery = "SELECT * FROM Employee";

            try {
                // 1. Load and register JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // 2. Establish connection
                Connection connection = DriverManager.getConnection(jdbcURL, username, password);

                // 3. Create a PreparedStatement for the select query
                PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

                // 4. Execute the query and retrieve the result set
                ResultSet resultSet = preparedStatement.executeQuery();

                // 5. Iterate through the result set and display the table data
                System.out.println("emp_code | emp_name | emp_age | emp_sal");
                System.out.println("----------------------------------------");
                while (resultSet.next()) {
                    int emp_code = resultSet.getInt("emp_code");
                    String emp_name = resultSet.getString("emp_name");
                    int emp_age = resultSet.getInt("emp_age");
                    int emp_sal = resultSet.getInt("emp_sal");

                    System.out.printf("%-8d | %-8s | %-7d | %-7d%n", emp_code, emp_name, emp_age, emp_sal);
                }

                // 6. Close the result set, statement, and connection
                resultSet.close();
                preparedStatement.close();
                connection.close();

            } catch (ClassNotFoundException e) {
                System.out.println("JDBC Driver not found.");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("Database error.");
                e.printStackTrace();
            }
        }
    }
    
