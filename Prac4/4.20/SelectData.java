import java.io.*;
 import javax.servlet.*;
 import javax.servlet.http.*;
 import java.sql.*;
  
 public class SelectData extends HttpServlet {
  
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
         PrintWriter out = res.getWriter();
         res.setContentType("text/html");
         out.println("<html><body>");
         try {
             Class.forName("org.postgresql.Driver");
             Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/s2a130050131535", "postgres", "byebye4842");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select * from student");
			 out.println("enroll no:130050131535");
             out.println("<table border=1>");
             out.println("<tr><th>Enroll no</th><th>Name</th><th>branch</th><tr>");
             while (rs.next()) {
                 int n = rs.getInt("rollno");
                 String nm = rs.getString("name");
                 String s = rs.getString("branch"); 
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>"); 
             }
             out.println("</table>");
             out.println("</html></body>");
             con.close();
            }
             catch (Exception e) {
             out.println("error");
         }
     }
 }