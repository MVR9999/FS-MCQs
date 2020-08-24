// java -cp "e:\mysql-connector-java-5.1.42-bin.jar;." preparedStatement

import java.sql.*;

class preparedStatement {
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
  static final String DB_URL = "jdbc:mysql://localhost/test";
    
  static final String USER = "root";
  static final String PASS = "123456";
     
  public static void main(String[] args) throws SQLException {  
    Connection conn = null;
    PreparedStatement pstmt = null;
    
    try{
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");

      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      pstmt = conn.prepareStatement("insert into dept values(?,?, ?)"); 
      pstmt.setInt(1, 60);  //1 specifies the first parameter in the query  
      pstmt.setString(2, "Marketing"); 
      pstmt.setString(3, "Mumbai");

      int i=pstmt.executeUpdate();  
      System.out.println(i + " record inserted");        
    }   
    catch(Exception e){
      e.printStackTrace();
    }
    finally
    {
      pstmt.close();
      conn.close();
    }
  }
}     
