// java -cp "e:\mysql-connector-java-5.1.42-bin.jar;." getDepartments

import java.sql.*;

class getDepartments {
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
      System.out.println("Connecting to database...");

      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      System.out.println("Creating statement...");

      stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, 
        ResultSet.CONCUR_READ_ONLY);
      String sql;
      sql = "SELECT * from dept";
      rs = stmt.executeQuery(sql);

      while(rs.next()){
        int deptno  = rs.getInt("deptno");
        String dname = rs.getString("dname");
        String location=rs.getString("location");
        System.out.print(" deptno : " +deptno);
        System.out.print(" deptname : " + dname);
        System.out.println(" location : " + location);
      }      
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
