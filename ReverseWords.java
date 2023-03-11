package homework3;
import  java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please write a word: ");
		String word =input.nextLine();
		String reverseWord="";
		
		for(int i= word.length()-1 ; i>=0 ;i--) {
			reverseWord += word.charAt(i);
		}
		
		System.out.println("Your word is "+word +". Reverse of this word is "+reverseWord);
		
		int isPalindrome = word.compareTo(reverseWord);  //it returns 0, if they are equal
		
		if (isPalindrome==0)
			System.out.println("**Your word "+word+" is Palindrome**");
		else 
			System.out.println("Your word "+word+" is not Palindrome.");
		input.close();
	}	
	
}
