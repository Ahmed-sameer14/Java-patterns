package vco.Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo2 
{
	public static void main(String[] args) 
	{
		//create a new file
		File f = new File("demo2.txt");
		try 
		{
			f.createNewFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//code to write to a file
		try 
		{
			FileWriter fw = new FileWriter(f);
			fw.write("this is our first file creation from java \nthank you");
			fw.close();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//reading  a file
		
		//reading for another file
//		File mynewfile = new File("demo3.txt");
		Scanner sc;
		try 
		{
			sc = new Scanner(f);
			while(sc.hasNextLine())
			{
				String s = sc.nextLine();
				System.out.println(s);
			}
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//deleting file
		/*
		if(f.delete())
		{
			System.out.println("i have deleted : "+f.getName());
		}
		else
		{
			System.out.println("some problem occured while deleting file");
		}
		*/
	}
}
