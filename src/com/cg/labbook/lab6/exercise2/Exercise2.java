package com.cg.labbook.lab6.exercise2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Exercise2 
{
	public static void main(String[] args) 
	{
		FileReader fr = null;
		try 
		{	
			fr=new FileReader("C:\\Users\\prasa\\OneDrive\\Desktop\\CAPGEMINI\\Assignments Capgemini Training\\Module 2\\JAVA_LABBOOK\\src\\com\\cg\\labbook\\lab6\\exercise2\\Names.txt");
			BufferedReader br =new BufferedReader(fr);
			String str;
			int lineNumber=0;
			while((str=br.readLine())!=null)
			{
				lineNumber++;
				System.out.println(lineNumber+" "+str);
			}
			br.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.out.println(e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}