package com.cg.labbook.lab6.exercise4;
import java.io.File;
import java.util.Scanner;
public class Exercise4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String fileName=sc.next();
		File f=new File(fileName);
		System.out.println("File exists ?:"+f.exists());
		System.out.println("File readable :"+f.canRead());
		System.out.println("File writeable:"+f.canWrite());
		System.out.println("File type:"+getFileExtension(f));
		System.out.println("File size in bytes"+f.length());
		sc.close();
	}
	public static String getFileExtension(File file) 
	{
		String extension = "";
		try 
		{
			if (file != null && file.exists()) 
			{
				String name = file.getName();
				extension = name.substring(name.lastIndexOf("."));
			}
		}
		catch (Exception e)
		{
			extension = "";
		}
		return extension;
	}
}