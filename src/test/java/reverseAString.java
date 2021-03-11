

;

import java.util.Scanner;

public class reverseAString {

	
	public static void main(String[] args)
	{
		//String testString= "Geeks FOR geeks";
		
		System.out.println(" Pl ease enter the input string :- ");
		Scanner in = new Scanner(System.in);
		String testString=in.nextLine();
		
		
		char[] charArray=testString.toCharArray();
		char tempChar;
		int length=testString.length();
		System.out.println(" The original String is " + testString);
		
		for(int i=0 ; i <length/2; i++)
		{
			tempChar=charArray[i];
			charArray[i]=charArray[length-1-i];
			charArray[length-1-i]=tempChar;
		}
		
	System.out.print(" The reversed string is ");
		for(char c :charArray)
		{
			System.out.print(c);
		}
	}
}
