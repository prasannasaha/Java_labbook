import java.util.Scanner;

public class PasswordValidator 
{
	public static boolean validatePassword(String pass1,String pass2)throws PasswordMismatchException
	{	
		if(pass1.equals(pass2))
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the customer name");
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		System.out.println("Enter the password");
		String pass1=sc.next();
		System.out.println("ReEnter the password");
		String pass2=sc.next();
		try 
		{
			if(validatePassword(pass1,pass2)==true)
			{
				System.out.println("Registered Successfully");
			}
			else
				throw new PasswordMismatchException("PASSWORD does not match");
		}
		catch(PasswordMismatchException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
