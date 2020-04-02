//Source for development - (https://cloud.google.com/translate/docs/basic/discovering-supported-languages)

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class ReviewTranslation {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/tonyc/Documents/NetBeansProjects/INQUIRE/beatlestxt.txt");
        Scanner scanny = new Scanner(file);
        String fileContent = "";
        while (scanny.hasNextLine()) {
            fileContent = fileContent.concat(scanny.nextLine() + "\n");
        }
        String text = fileContent;
        PrintWriter writer = new PrintWriter("beatlestranslation.txt", "UTF-8");
        writer.println("Translated text: " + translate("en", "es", fileContent));
        writer.close();
    }

    private static String translate(String langFrom, String langTo, String text) throws IOException {
        String urlStr = "https://script.google.com/macros/s/AKfycbw35WvcmvA7iG28WGR7DW6CkgSS-NVb8hk8rQ3zmwDTWjWOCGYb/exec"
                + "?q=" + URLEncoder.encode(text, "UTF-8")
                + "&target=" + langTo
                + "&source=" + langFrom;
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }

}
