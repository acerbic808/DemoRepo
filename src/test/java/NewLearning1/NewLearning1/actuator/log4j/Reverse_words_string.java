package NewLearning1.NewLearning1.actuator.log4j;

public class Reverse_words_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am learning Java";
		String[] str_arr=str.split(" ");
		String res="";
		
		
		for(String s:str_arr) {
			
			StringBuffer rev=new StringBuffer(s);
			String rev1=rev.reverse().toString();
			res=res+rev1+" ";
			
			
			
		}

		System.out.println("Reverse:"+res);
		
	}

}
