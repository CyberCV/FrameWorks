import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {
    public static List<Map<String,String>> setData(String path,String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xlsx.getSheet(sheetName);

        List<Map<String,String>> excelData = new ArrayList<>();

        Row headerRow=sheet.getRow(0);

        for (int j = 1; j < sheet.getPhysicalNumberOfRows(); j++) {

            Row row = sheet.getRow(j);

            LinkedHashMap<String,String> linkedHashMap=
                    new LinkedHashMap();

            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++){

                linkedHashMap.put(headerRow.getCell(i).toString(),
                        row.getCell(i).toString());

            }
            excelData.add(linkedHashMap);
        }
        return excelData;

    }
    public static void main(String [] args) throws IOException {
        String path = "C:\\Users\\17033\\Documents\\Book3.xlsx";
        List<Map<String,String>> excelData =
                ExcelReader.setData(path,"Sheet1");

        System.out.println(excelData.get(1).get("FirstName"));
        System.out.println(excelData.get(4).get("Age"));

    }

}
/*
Interview key notes
explain concept and tell how you use it in your framework
oops and collections Arrays
 */