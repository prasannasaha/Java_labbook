import java.util.Scanner;

public class MemoryRecall 
{
	public static boolean checkIn(char r)
	{
		int ar[]= {86,73,66,71,89,82,79};
		int f=0;
		for(int i:ar)
		{
			if((int)r==i)
			{
				f=1;
			}
		}
		if (f==0)
		{
			return false;
		}
		else
			return true;
	}
	public static boolean check(String S)
	{
		
		for(int i=0;i<S.length();i++)
		{
			if(checkIn(S.charAt(i))==false)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String []args)
	{
		System.out.println("Enter the acronym");
		Scanner sc= new Scanner (System.in);
		String S=sc.next();
		if(check(S)==true)
		{
			for(int i=0;i<S.length();i++)
			{
				switch(S.charAt(i))
				{
					case 'V':System.out.println("Violet");
					break;
					case 'I':System.out.println("Indigo");
					break;
					case 'B':System.out.println("Blue");
					break;
					case 'G':System.out.println("Green");
					break;
					case 'Y':System.out.println("Yellow");
					break;
					case 'O':System.out.println("Orange");
					break;
					case 'R':System.out.println("Red");
					break;
				}
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
