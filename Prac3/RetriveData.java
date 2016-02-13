import java.sql.*;
public class RetrieveData {
   static final String JDBC_DRIVER = "org.postgresql.Driver";
   static final String DB_URL = "jdbc:postgresql://127.0.0.1:5433/s2a130050131535";
   static final String USER = "postgres";
   static final String PASS = "byebye4842";
   public static void main(String[] args) {
       Connection conn = null;
       CallableStatement cstmt = null;
       String name, rollno, branch;
       try{
		      System.out.println("Enrollno: 130050131535");
              Class.forName(JDBC_DRIVER);
              System.out.println("Connecting to a selected database...");
              conn = DriverManager.getConnection(DB_URL, USER, PASS);
              System.out.println("Connected database successfully...");
              cstmt = conn.prepareCall("{call ret_data()}");
              cstmt.execute();
              System.out.println("All 'student' table data with 'branch' = 'CSE'");
              System.out.println();
              ResultSet rs = cstmt.getResultSet();
              System.out.print("Roll_no\t");
              System.out.print("Name\t");
              System.out.print("Branch\t");
              System.out.println("\n:-------------------------------:");
              while (rs.next())
              {
            	System.out.println();
            	System.out.print(rs.getString(1)+"\t");
                System.out.print(rs.getString(2)+"\t");
                System.out.print(rs.getString(3)+"\t");
                System.out.println();
              }
       }catch(SQLException se){
          se.printStackTrace();
       }catch(Exception e){
          e.printStackTrace();
       }finally{
          try{
             if(cstmt!=null)
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
}
}
