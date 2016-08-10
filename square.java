package project1;

import java.util.Scanner;

public class guvi_01 {
	public static void main(String args[])
	{
Scanner in=new Scanner(System.in);
System.out.println("ente the no");
int x1=in.nextInt();
int y1=in.nextInt();
int x2=in.nextInt();
int y2=in.nextInt();
int x3=in.nextInt();
int y3=in.nextInt();
int x4 = in.nextInt();
int y4=in.nextInt();
String result;

if(x1==x3&&x2==x4&&y3==y4&&y1==y2)
{
	result="The values form a square";
}
else
{
	result="The given values does't form a square";
}
System.out.println(result);
}
}