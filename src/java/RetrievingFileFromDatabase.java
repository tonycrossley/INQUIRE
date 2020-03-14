import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class RetrievingFileFromDatabase {
   public static void main(String args[]) throws Exception {
      //Registering the Driver
      Class.forName("com.mysql.jdbc.Driver");
      //Getting the connection
      String techworld3g = "jdbc:mysql://localhost:3306/techworld3g?user=root";
            Connection myConnection = DriverManager.getConnection(techworld3g);
      System.out.println("Connection established......");
      //Creating aStatement
      Statement stmt = myConnection.createStatement();
      //Retrieving the data
      ResultSet rs = stmt.executeQuery("select * from files");
      int j = 0;
      System.out.println("Contents of the table are: ");
      while(rs.next()) {
         System.out.println(rs.getString("id"));
         Clob clob = rs.getClob("file");
         Reader reader = clob.getCharacterStream();
         String filePath = "C:\\Users\\tonyc\\Desktop\\clob_outputnew"+j+".txt";
         FileWriter writer = new FileWriter(filePath);
         int i;
         while ((i = reader.read())!=-1) {
            writer.write(i);
            
         }
         writer.close();
         System.out.println(filePath);
         j++;
      }
   }
}