package controllers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import database.Db_Connection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)

public class UploadFileController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        InputStream inputStream = null;

        Random rand = new Random();
        int n = rand.nextInt(9999) + 1;
        String idTemp = (String.valueOf(n));

        String title = (request.getParameter("title"));
        Part filePart = request.getPart("file_uploaded");
        FileOutputStream fop = null;
        File file;
        String content = "This is the text content";

        file = new File("C://Users//tonyc//Desktop//INQUIREoutput//" + title + ".PNG");
        fop = new FileOutputStream(file);

        // if file doesnt exists, then create it
        if (!file.exists()) {
            file.createNewFile();
        }

        // get the content in bytes
        byte[] contentInBytes = content.getBytes();

        fop.write(contentInBytes);
        fop.flush();
        fop.close();

        System.out.println("Done");

        if (filePart != null) {
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            inputStream = filePart.getInputStream();
        }

        try {
            Db_Connection dbconn = new Db_Connection();
            Connection conn = dbconn.Connection();

            String sql = "INSERT INTO files (id, title, file) values (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, idTemp);
            statement.setString(2, title);

            if (inputStream != null) {
                statement.setBinaryStream(3, inputStream, (int) filePart.getSize());
            }

            int row = statement.executeUpdate();
            if (row > 0) {

                conn.close();

                RequestDispatcher rs = request.getRequestDispatcher("upload_form.jsp");
                rs.include(request, response);

            } else {

                conn.close();

                RequestDispatcher rs = request.getRequestDispatcher("upload_form.jsp");
                rs.include(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
