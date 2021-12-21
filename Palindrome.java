//Andrea Soteldo
//COSC-1430.501 (wed)
//Project3
//18Nov2020
//This program should tell you whether a word is a palindrome or not.
package college;
import java.util.Scanner;
public class Palindrome 
{	
	public static void main(String[] args)
	{
		char[] a = new char[80];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a text to check if it is a palindrome, end with period: ");
		String str = keyboard.nextLine();
		str = str.toUpperCase();
		int used = str.length();
		int i = 0; 
		
		while (i < str.length() && i < a.length) 
		{
			a[i] = str.charAt(i);
			i++;
		}
			
		i = 0;
			
		while ((str.charAt(i) != '.') && (i != str.length() - 1))
		{
			if (isPalindrome(a, used))
				System.out.println(str + " is a palindrome."); 
			else
				System.out.println(str + " is not a palindrome.");
			break;
		}
	}
	
	public static boolean isPalindrome(char[] a, int used)
	{
		
		int i = 0;		
		int j = used - 1; 
		
		while (i < used/2)
		{
			if (a[i] == ' ' || a[i] == '.') 
			{
				i++;
			}
			if (a[j] == ' ' || a[j] == '.') 
			{
				j--;
			}
			if (a[i] != a[j]) 
			{
				return false; 
			}
			i++;
			j--;
		}
		return true;
	}
}