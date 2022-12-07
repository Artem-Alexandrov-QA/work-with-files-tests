package com.alexandrov.tests;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.InputStream;
import static org.assertj.core.api.Assertions.assertThat;

public class DocxFileTest {

    private String fileName = "doc.docx";
    private String fileContent = "Практическое задание № 13";

    @Test
    void docxFileTest() throws Exception {
        String doc;
        try (InputStream stream = getClass().getClassLoader().getResourceAsStream(fileName)) {
            WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(stream);
            doc = wordMLPackage.getMainDocumentPart().getContent().toString();
        }
        assertThat(doc).contains(fileContent);
    }
}
