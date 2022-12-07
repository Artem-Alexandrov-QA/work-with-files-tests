package com.alexandrov.tests;
import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PdfFileTest {

    private String fileTittle = "Мануал по работе с Postman";
    private String filePath = "./src/test/resources/pdf_doc.pdf";

    @Test
    public void downLoadPdfTest() throws Exception {
        PDF pdf = new PDF(new File(filePath));
        assertThat(pdf.title).contains(fileTittle);
    }
}
