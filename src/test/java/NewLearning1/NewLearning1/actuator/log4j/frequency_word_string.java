package NewLearning1.NewLearning1.actuator.log4j;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class frequency_word_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please input a new line to count the frequency of words");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//str.replaceAll("a", " ");
		Map<String,Integer>map=new LinkedHashMap<String,Integer>();
		Integer count=1;
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				
				map.put(arr[i], count);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
				
		}
		
		for(String x:map.keySet()) {
			
			System.out.println("count of word:"+x+" ="+map.get(x));
		}
		
		
		
		

	}

}
