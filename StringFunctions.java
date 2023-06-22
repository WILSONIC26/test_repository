package DEMO;

public class StringFunctions {

	public static void main(String[] args) {
		// Initialising with some string value
		String string_var1 = "String functions program";
		String string_var2 = "String functions";
		
		// Commonly used String functions
		System.out.println("String Operations are:");
		
		// Getting character at a specific position
		System.out.println(string_var1.charAt(4));
		
		// Getting unicode character before the specific index
		System.out.println(string_var1.codePointAt(3));
		
		// Getting unicode character before the specific point
		System.out.println(string_var1.codePointBefore(1));
		
		// Counting number of unicode characters between the indexes given
		System.out.println(string_var1.codePointCount(0, 5));
		
		// Compare two strings lexicographically i.e based on unicode value
		System.out.println("\nstring comparison function");
		
		System.out.println(string_var1.compareTo(string_var2));
		
		// Compare two strings lexicographically ignoring the case
		System.out.println(string_var1.compareToIgnoreCase(string_var2));
		
		// Appends a string with another
		System.out.println("\nConatenated string");
		System.out.println(string_var1.concat(string_var2));
		
		// Checks whether a string contains another string
		System.out.println(string_var1.contains(string_var2));
		
		// Checks whether a string ends with specific characters
		System.out.println(string_var1.endsWith("gram"));
		
		// Compare and returns true if the strings are equal
		System.out.println(string_var1.equals(string_var2));
		
		// Compare and returns true  if the strings are equal by ignoring the case sensitivity 
		System.out.println(string_var1.equalsIgnoreCase(string_var2));
		
		// Hash code for a string is computed like this
		// s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		System.out.println(string_var1.hashCode());
		
		// Gets the position of first occurrence of specific characters
		System.out.println(string_var1.indexOf("program"));
		
		// Verifies if strings are equal
		String string_var3 = "demo";
		System.out.println(string_var3.isEmpty());
		
		// Gets position of last occurrence of specific characters
		string_var3 = "functions program functions";
		System.out.println("\nlast occurrence position");
		System.out.println(string_var3.lastIndexOf("functions"));
		
		// Get string lengths
		System.out.println(string_var1.length());
		
		// Search string with specific value and replaces with
		System.out.println(string_var3.replace("functions", "java"));
		System.out.println(string_var3);
		
		// Verifies if a string starts with a given string
		System.out.println(string_var1.startsWith("string"));
		
		// Converts string to lower case
		string_var1 = "HELLO WORLD";
		System.out.println(string_var1.toLowerCase());
		
		// Converts string to upper case
		System.out.println(string_var1.toUpperCase());
		
		// Trims space before and all the string
		String string_var4 = "     Hello World  ";
		System.out.println(string_var4.trim());
		
				
		}

}
