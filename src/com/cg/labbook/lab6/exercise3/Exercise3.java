package com.cg.labbook.lab6.exercise3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Exercise3 
{
	public static void main(String[] args) 
	{	
		FileReader fr = null;
		String file="";
		int characterCount=0;
		int lineNumber=0;
		int countWords=0;
		try 
		{	
			fr=new FileReader("C:\\Users\\prasa\\OneDrive\\Desktop\\CAPGEMINI\\Assignments Capgemini Training\\Module 2\\JAVA_LABBOOK\\src\\com\\cg\\labbook\\lab6\\exercise3\\Names.txt");
			BufferedReader br =new BufferedReader(fr);		
			String str="";
			while((str=br.readLine())!=null)
			{
				file+=str+" ";
				lineNumber++;
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
			System.out.println("in IO");
			System.out.println(e.getMessage());
		}
		for(int i=0;i<file.length();i++)
		{
			if((file.charAt(i)>64 && file.charAt(i)<90) || (file.charAt(i)>96 && file.charAt(i)<123))
			{
				characterCount++;
			}
		}
		System.out.println("Total Characters= "+characterCount);
		System.out.println("Total lines= "+lineNumber);
		StringTokenizer S=new StringTokenizer(file," ");
		countWords=S.countTokens();
		System.out.println("Total words= "+countWords);	
	}
}
