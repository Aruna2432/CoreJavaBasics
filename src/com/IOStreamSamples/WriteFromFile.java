package com.IOStreamSamples;
import java.io.FileWriter;
public class WriteFromFile {

	public static void main(String[] args) {
		
		String data= "Hello everyone...";
		try {
			FileWriter output=new FileWriter("C:\\Users\\TEN\\Desktop\\output.txt");
			output.write(data);
			output.flush();
			output.close();
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}

