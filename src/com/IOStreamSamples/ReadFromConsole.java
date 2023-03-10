package com.IOStreamSamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
	public static void process(String str)
	{
		System.out.println(" Procecessin...> ");
	}
	private static void doReadFromStdin()
	{
		try {
			BufferedReader inStream=new BufferedReader(new InputStreamReader(System.in));
			String inLine="";
			
			while(!(inLine.equalsIgnoreCase("Quit")) && ! (inLine.equalsIgnoreCase("Exit")))
			{
				System.out.println("prompt> ");
				inLine=inStream.readLine();
				process(inLine);
			}
		} catch(IOException e)
		{
			System.out.println("IO Exception: " +e);
		}
		
	}
public static void main(String[] args)
{
	doReadFromStdin();
	}
}

