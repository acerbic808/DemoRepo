package NewLearning1.NewLearning1.actuator.log4j;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a number to be reversed");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		String str=Integer.toString(a);
		//System.out.println("The converted integer is: "+str);
		
		StringBuffer rev=new StringBuffer(str);
		String str1=rev.reverse().toString();
		System.out.println("The converted reversed integer is: "+rev);
		System.out.println("The converted reversed integer is: "+str1);
		

	}

}
