package NewLearning1.NewLearning1.actuator.log4j;

import java.util.Scanner;

public class Palindrome_recursion {
	
	public static boolean ispalindrome(String s) {
		
		if(s==null || s.length()==1) {
			System.out.println("It is palindrome");
			return true;
		}
		if (s.length()==2 && s.charAt(0)==s.charAt(s.length()-1) ) {
			System.out.println("is a palindrome");
			return true;
		}
		if(s.charAt(0)==s.charAt(s.length()-1)) {
			
           return ispalindrome(s.substring(1,s.length()-1));
			//System.out.println(s);
						
		}
		
		else {
			System.out.println("Not a palindrome");
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Please enter a string to determine a palindrome");
//		Scanner s=new Scanner(System.in);
//		String str=s.nextLine();
		
		String str="MaaM";
		boolean p=Palindrome_recursion.ispalindrome(str);
		
		

	}

}
