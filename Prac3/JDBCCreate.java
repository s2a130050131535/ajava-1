
import java.sql.*;

public class JDBCCreate{
   
   static final String JDBC_DRIVER = "org.postgresql.Driver";  
   static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/s2a130050131535";

   
   static final String USER = "postgres";
   static final String PASS = "byebye4842";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      
      Class.forName(JDBC_DRIVER);

      
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      
      System.out.println("Creating table in given database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE TABLE BANK" + "( Acc_no DOUBLE PRECISION, " + "Name VARCHAR(20),"+"Balance DOUBLE PRECISION,"+"Ph_no DOUBLE PRECISION, "+"Address VARCHAR(20))"; 
	  stmt.executeUpdate(sql);
      System.out.println("Created table in given database...");
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("End of file.");
   
   }
   }