package com.cybertek.tests.day14_excel_io;

import com.sun.media.sound.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class ReadExcellFile2 {
    public static void main(String[] args) throws IOException, InvalidFormatException {

        String filePath = "vytrack_testusers.xlsx";
        //create File object
        File file = new File(filePath);
        //create workbook object
        //XSSSFWorkbook - xlsx, new
        //HSSFWorkbook - xls, old
        //Workbook interface that is implemented both of them
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheet("QA3-short");
        //get number of rows
        int rowNum = sheet.getLastRowNum();
        //get number of columns
        int colNum = sheet.getRow(0).getLastCellNum();

        //ouiter loop to iterate rows
        for(int rowIndex = 0; rowIndex <= rowNum; rowIndex++){
            //inner loop to iterate cells
            for(int columnIndex = 0; columnIndex < colNum; columnIndex++){
                String value = sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
                System.out.printf("%15s ", value);// number of space after %15s gives number of spaces between each column - here there is 1 space
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++++++ WITH FOR EACH LOOP");
        for(Row row : sheet){
            for(Cell cell : row){
                System.out.printf("%15s  ", cell.getStringCellValue()); //here there are 2 space
            }
            System.out.println();
        }
    }

}
