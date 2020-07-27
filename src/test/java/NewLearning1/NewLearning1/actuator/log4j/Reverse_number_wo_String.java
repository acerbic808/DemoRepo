package NewLearning1.NewLearning1.actuator.log4j;

import java.util.Scanner;

public class Reverse_number_wo_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a number to be reversed");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int revnum=0;
		
		
		int rem=a%10;
		int residue=a;
		int sum=0;
	
		while (residue>0) {
			System.out.println("residue now is: "+residue);
		  rem=residue%10;	
		 sum=sum*10+rem;
		 residue=residue/10;
		 
		 			
		}
		
		System.out.println("The reversed number is: "+sum);
		
		
		
		

	}

}
