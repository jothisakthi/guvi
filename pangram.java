package project1;

import java.util.Scanner;

public class guvi {
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	
	String result = null;
	System.out.println("enter the string");
	String i=sc.nextLine();
	if(i.length()<26)
	{
		result="String is not a palgram";
		
	}
	else 
	{
		for(char d='a';d<='z';d++)
		{
		
		result="String is palgram";
			break;
			}
	
	}
	System.out.println(result);
	   }
	     }

