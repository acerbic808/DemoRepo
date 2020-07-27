package NewLearning1.NewLearning1.actuator.log4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array_Largest_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,998,32,24,97,3};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i:arr) {
			
			if(i<smallest)
				smallest=i;
			if(i>largest)
				largest=i;
			
		}
		
		System.out.println("The largest element is "+largest);
		System.out.println("The smallest element is "+smallest);
		System.out.println("The array is"+Arrays.toString(arr));
		
		
		
		System.out.println("The sorted Array is"+Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 24));
		
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		map.containsKey(2);
		
		
		
		

	}

}
