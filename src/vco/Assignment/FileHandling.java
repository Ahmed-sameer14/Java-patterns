package vco.Assignment;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling 
{

	public static void main(String[] args)  
	{
		
		File f =  new File("demo.txt");
		FileOutputStream fo;
		try 
		{
			fo = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(fo);
			dos.writeUTF("new creation of file");
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		FileInputStream fi;
		try 
		{
			fi = new FileInputStream(f);
			DataInputStream di = new DataInputStream(fi);
			String s = di.readUTF();
			System.out.println(s);
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
