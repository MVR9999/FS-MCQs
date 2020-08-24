// java -cp "e:\mysql-connector-java-5.1.42-bin.jar;." dropTables

import java.sql.*;

class dropTables {
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
  static final String DB_URL = "jdbc:mysql://localhost/test";
    
  static final String USER = "root";
  static final String PASS = "123456";
     
  public static void main(String[] args) throws SQLException {  
    Connection conn = null;
    Statement stmt = null;
    
    try{
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");

      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      System.out.println("Creating statement...");

      stmt = conn.createStatement();

      stmt.executeUpdate("drop table emp");
      stmt.executeUpdate("drop table dept");
    }   
    catch(Exception e){
      e.printStackTrace();
    }
    finally
    {
      stmt.close();
      conn.close();
    }
  }
}     
