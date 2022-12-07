package com.alexandrov.tests;

import net.lingala.zip4j.core.ZipFile;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ZipFileTest {

    private String zipFilePath = "./src/test/resources/zip.zip";
    private String unzipFolderPath = "./src/test/resources/unzipped/";
    private String zipPassword = "123456";
    private String unzippedFileName = "txt.txt";
    private String unzippedFileContent = "Чемпионат мира по футболу 2022";

    @Test
    void zipFileTest() throws Exception {
        ZipFile zipFile = new ZipFile(zipFilePath);
        if (zipFile.isEncrypted()) {
            zipFile.setPassword(zipPassword);
        }
        zipFile.extractAll(unzipFolderPath);

        String unzippedFileData = FileUtils.readFileToString(FileUtils
                .getFile(unzipFolderPath + unzippedFileName), "UTF-8");

        assertThat(unzippedFileData).contains(unzippedFileContent);
    }
}
