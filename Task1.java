import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		task2();
		task3();
		String input1="Nalam";
		String input2="Alekhya";
		int input3=979967;
		int input4=3;
		String smaller="";
		String larger="";
		if(input1.length()<input2.length()) {
		
			smaller=input1;
			larger=input2;
		}else if(input1.length()>input2.length()) {
			smaller=input2;
			larger=input1;
		}else {
			
		}
		String result="";
		result=result+smaller.charAt(smaller.length()-1)+larger;
		System.out.println(result);
		String in3=""+input3;
		result=result+in3.charAt(input4-1)+in3.charAt(in3.length()-input4);
		System.out.println(result);
		String toggle="";
		for(int i=0;i<result.length();i++) {
			char ch=(result.charAt(i));
			if(Character.isUpperCase(result.charAt(i))) {
				ch=(char)(ch+32);
				toggle=toggle+ch;
			}else if(Character.isLowerCase(result.charAt(i))){
				ch=(char)(ch-32);
				toggle=toggle+ch;
			}else {
				toggle=toggle+ch;
			}
		}
		System.out.println(toggle);

	}
	
	public static void task2() {
		int input1=1234;
		Set<Integer> s=new HashSet<Integer>();
				while(input1>0) {
					s.add(input1%10);
					input1=input1/10;
				}
				System.out.println(s.size());
	}
	
	
	public static void task3() {
		int input1[]= {9,6,1,4,2};
		int b[]=input1.clone();
		Arrays.sort(b);
		Map<Integer,Character> m=new HashMap<Integer,Character>();
		for(int i=0;i<b.length;i++) {
			m.put(b[i], (char)('a'+i));
		}
		System.out.println(m);
		char ch[]=new char[b.length];
		for(int i=0;i<b.length;i++) {
			ch[i]=m.get(input1[i]);
			System.out.println(ch[i]);
		}
		
		
	}

}
