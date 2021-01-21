package memoryProject;

public class Palindrome {
	Boolean check(String ... strings) { // Using 'var-args' since number of arguments passed varies.
		Boolean allPalindromes = true; // Starts as true. If any string fails the Palindrome test, will be set to false and returned immediately, since we are testing for all strings as Palindromes.
		
		for (String str : strings) { // Loop through each argument in the var-args array to test each string as a Palindrome.
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append(str);
			strBuilder = strBuilder.reverse(); // Reversing the string with StringBuilder.
			
			if (!str.contentEquals(strBuilder.toString())) { // If any string fails the Palindrome test, will be set to false and returned immediately.
				allPalindromes = false;
				return allPalindromes;
			}
		}
		
		
		return allPalindromes; // If all strings pass the check, boolean variable allPalindromes is returned with it's original value of true.
	}
}
