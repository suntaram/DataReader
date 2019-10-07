package com.csvreader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileConstantTest {
	

	@Value("${datareadertest.CSV-PATH}")
    public String CSV_PATH;
	@Value("${datareadertest.XML-PATH}")
	public String XML_PATH;

}
