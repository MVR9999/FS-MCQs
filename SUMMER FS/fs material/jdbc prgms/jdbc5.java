// java -cp "e:\mysql-connector-java-5.1.42-bin.jar;." jdbc5

import java.sql.*;
import java.time.*;

class jdbc5 {
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
  static final String DB_URL = "jdbc:mysql://localhost/test";
    
  static final String USER = "root";
  static final String PASS = "123456";
     
  public static void main(String[] args) throws SQLException {  
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try{
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
          ResultSet.CONCUR_READ_ONLY);

      String sql;
      sql = "SELECT empno from emp order by empno";
      rs = stmt.executeQuery(sql);  
      rs.afterLast();
      System.out.println(rs.previous());
      System.out.println(rs.getInt(1)); 
      System.out.println(rs.previous());
      System.out.println(rs.getInt(1));
      System.out.println(rs.last()); 
      System.out.println(rs.getInt(1)); 
      System.out.println(rs.first()); 
      System.out.println(rs.getInt(1)); 
      rs.beforeFirst();
      System.out.println(rs.getInt(1));             
    }   
    catch(Exception e){
      e.printStackTrace();
    }
    finally
    {
      rs.close();
      stmt.close();
      conn.close();
    }
  }
}     
