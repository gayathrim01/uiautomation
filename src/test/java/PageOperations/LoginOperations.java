package PageOperations;

import java.io.IOException;
import java.util.*;


import CommonLogics.Drivers;
import CommonLogics.ExcelLogics;

public class LoginOperations {

	public void launchApplication() {
		Drivers.driver.navigate().to("https://www.youtube.com");
		
	}

	public void data() throws IOException {
		String path = "C:\\Users\\lenovo\\OneDrive\\Documents\\Book1.xlsx";
		for(int rowNum=0;rowNum<=ExcelLogics.rowCount(path);rowNum++) {
		ArrayList<Object> rowData=(ArrayList<Object>) ExcelLogics.ReadDataRowWise(path, rowNum);
		String Name = (String) rowData.get(1);
		System.out.println("Name: "+Name);
		String AssetName = (String) rowData.get(2);
		System.out.println("Laptop: "+AssetName);
		}
	}
	

}
