package com.filereader.service;

import com.filereader.model.Customer;
import com.filreader.exception.ReferenceNotFoundException;

public class ReferenceService {
	
		private void handlException() throws ReferenceNotFoundException {
			
			try {
				
				referenceException(new Long(""));
			}
			catch(ReferenceNotFoundException cause) {
				throw new ReferenceNotFoundException("A message that describes the error.", cause);
			}
			
		}
	
	 
	    public static void referenceException(Long referenceNo) throws ReferenceNotFoundException{

	        try {
	        	if(referenceNo==null || referenceNo.equals(""))
		            throw new ReferenceNotFoundException("Reference is empty!", null );
	        	} 
	        catch (ReferenceNotFoundException e) {
	            e.printStackTrace();
	        }

	    }

}
