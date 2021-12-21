//Andrea Soteldo
//COSC-1430.501 (wed)
//Project3
//18Nov2020
//This program should tell you whether a word is a palindrome or not.
package src;
import java.util.Scanner;
public class Palindrome 
{	
		public boolean isPalindrome(char[] a, int used)
		{
			a = new char[80];
			String str = "";
			used = str.length();
			int i = 0, j = used - 1;
			
			while ((i < j) && ((str.charAt(i) != '.') || (str.charAt(i) != ' ')))
			{
				if (str.charAt(i) != str.charAt(j))
					return false;
					i++;
					j--;
			}
			return true;
		}
		
		public static void main(String[] args) 
		{
			char[] a = new char[80];
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter a text to check if it is a palindrome, end with period: ");
			String str = "";
			str = str.toUpperCase();
			str = keyboard.nextLine();
			int used = str.length();
			
			if (a.isPalindrome(a, used))
				System.out.println(str + " is a palindrome."); 
			else
				System.out.println(str + " is not a palindrome."); 
		}
		{
			System.out.println("Press 0 to quit, 1 to continue");
			System.exit(0);
			}
}
