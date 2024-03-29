package com.csvreader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.filereader.model.Customer;
import com.filereader.records.CSVItemReader;
import com.filereader.records.XMLItemReader;


public class CSVItemReaderTest {
	
	@Autowired
	FileConstantTest fileConstants;
	
	@Test
	public void readCSVDataTest() throws FileNotFoundException {
		
			 List<Customer> failedrecordlist = new ArrayList<Customer>();
			//calling csv reader method to check read functionality
			 failedrecordlist=CSVItemReader.readCSVData(fileConstants.CSV_PATH);

			for (Customer customer:failedrecordlist) {
				System.out.println("Reference : "+customer.getReference()+" Description :"+customer.getDesc()+ "  Reason:"+customer.getReason());	  	
	        }
			
		}  
	
	@Test
	public void xmlreadFileTest() {
		
		List<Customer> failedrecordlist = new ArrayList<Customer>();
		failedrecordlist=XMLItemReader.readFile(fileConstants.XML_PATH);
		
		for (Customer customer:failedrecordlist) {
			System.out.println("Reference : "+customer.getReference()+" Description :"+customer.getDesc()+ "  Reason:"+customer.getReason());   
        }
		
	}

}

