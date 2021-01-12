package com.cts.cts2020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIO {

	public static void main(String[] args) {

  try {
	InputStream is = new FileInputStream
			  ("C:\\Users\\Gyan\\eclipse-workspace\\cts2020\\src\\myTest.txt");

	OutputStream os = new FileOutputStream("C:\\Users\\Gyan\\eclipse-workspace\\cts2020\\src\\myOutput.txt");
	  
  while(is.read()!=-1) {
	  os.write(is.read());
	  //System.out.println();
  }; 
  
  
  } catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
