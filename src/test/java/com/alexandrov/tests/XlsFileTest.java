package com.alexandrov.tests;
import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class XlsFileTest {

    @Test
    public void xlsTest() throws Exception{
       try (InputStream stream = getClass().getClassLoader().getResourceAsStream("excel.xls")) {
           XLS parsed = new XLS(stream);
           assertThat(parsed.excel.getSheetAt(0).getRow(3).getCell(1).getStringCellValue())
                   .isEqualTo("Документ");
       }
    }
}
