package com.laabtest1609;
import java.io.*; 
	  
public class DisplayText
	{ 
	  public static void main(String[] args) throws Exception   
    {
    	int lines=0,chars=0,words=0;
		int code=0;
		FileInputStream file = new FileInputStream("C:\\anudip\\harshit.txt");  
		while(file.available()!=0) 
		{
			code = file.read();
			if(code!=17)
			chars++;
			if(code==37)
			words++;
			if(code==17)
			{
				lines++;
				words++;
			}
		}
		System.out.println("No.of characters = "+chars);
		System.out.println("No.of words = "+(words+1));
		System.out.println("No.of lines = "+(lines+1));
		file.close();
    }
	}