<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="database.Db_Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View File</title>
    </head>
    <body>

        <%  
            String id=(request.getParameter("id"));
            
            Blob file = null;
            byte[ ] fileData = null ;


            Connection myConn = null;
                Statement myStmt = null;
                ResultSet myRs = null;

                InputStream input = null;
                FileOutputStream output = null;

                try {
                        // 1. Get a connection to database
                        Db_Connection dbconn=new Db_Connection();
            Connection myconnection= dbconn.Connection();

                        // 2. Execute statement
                        myStmt = myconnection.createStatement();
                        String sql = "select file from files where title='test3'";
                        myRs = myStmt.executeQuery(sql);
			
                        // 3. Set up a handle to the file
                        File theFile = new File("realtitties.pdf");
                        output = new FileOutputStream(theFile);

                        if (myRs.next()) {

                                input = myRs.getBinaryStream("file"); 
                                System.out.println("Reading resume from database...");
                                System.out.println(sql);
				
                                byte[] buffer = new byte[1024];
                                while (input.read(buffer) > 0) {
                                        output.write(buffer);
                                }
				
                                System.out.println("\nSaved to file: " + theFile.getAbsolutePath());
				
                                System.out.println("\nCompleted successfully!");				
                        }

                } catch (Exception exc) {
                        exc.printStackTrace();
                } finally {
                        if (input != null) {
                                input.close();
                        }

                        if (output != null) {
                                output.close();
                        }
			
			
                }
        }
                
            
        %>

        <br><br>
        <a href="main_page.jsp">Go to Main Page...</a>        

    </body>
</html>