package controllers;

import java.io.File;
import java.io.PrintWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReviewOCR {

    public static void main(String[] args) {
        try {
            File pdf_file = new File("C://Users//tonyc//Desktop//beatles.pdf");
            PDDocument document = PDDocument.load(pdf_file);
            PDFTextStripper pdfstripper = new PDFTextStripper();
            String ocr_text = pdfstripper.getText(document);
            PrintWriter writer = new PrintWriter("beatlestxt.txt", "UTF-8");
            writer.println(ocr_text);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
