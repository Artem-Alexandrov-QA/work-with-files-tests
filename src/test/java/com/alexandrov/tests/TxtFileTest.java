package com.alexandrov.tests;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class TxtFileTest {

    private String path = "./src/test/resources/doc.txt";

    @Test
    public void txtFileTest() throws Exception {
        String result;
        try (InputStream is = new FileInputStream(path)) {
            result = new String(is.readAllBytes(), "UTF-8");
        }
        assertThat(result).contains("Чемпионат мира по футболу 2022");
    }
}
