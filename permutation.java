
public class permutation {

	public static void main(String[] args) {
		String s="abcd";
		String result="";
		 permutate(s,result);
	}
	public static void permutate(String s,String result) {
		
		if(s.length()==0) {
			
			System.out.println(result + " ");
			
			}	
		
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			String right=s.substring(0,i);
			String left=s.substring(i+1);
		     String tot=right+left;
			permutate(tot,result+ch);		
		}		
	}
}
