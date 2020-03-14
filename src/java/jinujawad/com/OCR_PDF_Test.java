package jinujawad.com;

import java.io.File;
import java.io.PrintWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class OCR_PDF_Test {

    public static void main(String[] args) {
        try {
            File pdf_file = new File("C:\\Users\\tonyc\\Downloads\\PDF_READER-20200227T191455Z-001\\PDF_READER\\file1.pdf");
            PDDocument document = PDDocument.load(pdf_file);
            PDFTextStripper pdfstripper = new PDFTextStripper();
            String ocr_text = pdfstripper.getText(document);
            PrintWriter writer = new PrintWriter("itactuallyworks.html", "UTF-8");
            writer.println(ocr_text);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
