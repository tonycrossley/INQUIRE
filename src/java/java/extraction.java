
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class extraction {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        double count = 0, countBuffer = 0, countLine = 0;
        String lineNumber = "";
        String filePath = "C:\\Users\\tonyc\\Documents\\NetBeansProjects\\INQUIRE\\output.txt";
        BufferedReader br;
        String inputSearch = "dog";
        String line = "";

        try {
            br = new BufferedReader(new FileReader(filePath));
            try {
                while ((line = br.readLine()) != null) {
                    countLine++;
                    //System.out.println(line);
                    String[] words = line.split(" ");

                    for (String word : words) {
                        if (word.equals(inputSearch)) {
                            count++;
                            countBuffer++;
                        }
                    }

                    if (countBuffer > 0) {
                        countBuffer = 0;
                        lineNumber += countLine + ",";
                    }

                }
                br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        PrintWriter writer = new PrintWriter("keywordsOutput.html", "UTF-8");
        writer.println("The word " + inputSearch + " was found " + count + " time(s), on line " + lineNumber);
        writer.close();
    }
}
