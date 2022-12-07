package com.alexandrov.tests;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class DocxFileTest {

    private String path = "./src/test/resources/doc.docx";

    @Test
    public void docxFileTest() throws Exception {
        String result;
        try (InputStream is = new FileInputStream(path)) {
            result = new String(is.readAllBytes(), "UTF-8");
        }
        assertThat(result).contains("Чемпионат мира по футболу 2022");
    }
}
