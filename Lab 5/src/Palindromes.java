import java.util.Scanner;

/*
 *
 *
 *CS 2003 Lab 5
 *@author Kasey Mills
 *
 */


public class Palindromes {

	public static boolean isaPalindrome(String expr) {
		//Force expression to all lowercase
		expr = expr.toLowerCase();
		
		//This is a an empty input or of 0 length
		if (expr.length() == 0 || expr.equals(" ")) {
			//System.out.println("test");
			return true;
		}
		
		//This compares the first and last character of the string. 
		if (expr.charAt(0) == expr.charAt(expr.length() - 1)) {
			if (expr.length() == 3) {
				if (expr.charAt(0) == expr.charAt(expr.length() - 1)) {
					return true;
				}
			}
				
			//This calls isaPalindrome again and compares substring at location substring 1 and the end of the string -1
			//System.out.println(expr.length()); count test
			return isaPalindrome (expr.substring(1, expr.length() - 1));
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
			System.out.println("Enter in a word: ");
			Scanner scannerS = new Scanner(System.in);
			String newIn = scannerS.nextLine();
			if (isaPalindrome(newIn))
				System.out.println(newIn + " is a palindrome");
			else
				System.out.println(newIn + " is not a palindrome");
		
	
	}
	
}

/*
 *Lab Notes: 
 * 
 * Base case: when the length of the string is 0, return 0
 *	
 *	General case: if you can find a char 'x' you should return 1(Add to count)
 *	and callt he function with the new string
 *	if (str.charAt(0) == 'x' 
 *	return 1 + countX(str.substring(1));
 */