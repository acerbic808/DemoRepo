package NewLearning1.NewLearning1.actuator.log4j;

import java.util.Scanner;

public class star_pattern1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Please input the number of rows for star pattern");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
				
			}
			for (int k=1;k<=(2*i-1);k++) {
				
				System.out.print("*");
				Thread.sleep(100);
			}
			Thread.sleep(1000);
			System.out.println();
			
			
		}
		
		

	}

}
