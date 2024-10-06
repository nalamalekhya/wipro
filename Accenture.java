import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Accenture {

	public static void main(String[] args) {
		//rat();
		//binary();
		//int n=height();
		//System.out.println(n);
		//sales();
		//alpha();
		//password();need to work
		//majority();
		//magnet();
		//possibility();
		//least();
		//knapsack();//should learn
		homeless();

	}
	public static void homeless() {
		int n=3;
		int cou=0;
		int cap[]= {1,9,4};
		int peo[]= {3,8,5};
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(cap[j]>peo[i]) {
					cou++;
					cap[j]=-1;
					break;
				}
			}
		}
		System.out.print(n-cou);
		
	}
	public static void knapsack() {
		int w[]= {2,3,4};
		int p[]= {3,6,4};
		int m=6;
		int n=3;
		int t[][]=new int[n+1][m+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(i==0 &&j==0) {
					t[i][j]=0;
				}else if(w[i-1]<=j) {
					t[i][j]=Math.max(i, j);
				}
				
			}
		}
		
		
	}
	public static void least() {
	    Map<Character, Integer> a = new HashMap<>();
	    String str = "ccassacs";
	    char[] c = str.toCharArray();
	    
	  
	    for (char ch : c) {
	        a.put(ch, a.getOrDefault(ch, 0) + 1);
	    }
	    for (Map.Entry<Character, Integer> m : a.entrySet()) {
	        System.out.println(m.getKey() + " " + m.getValue());
	    }
	    int min = Integer.MAX_VALUE;
	    char leastChar = '\0'; 

	    for (Map.Entry<Character, Integer> m : a.entrySet()) {
	        if (m.getValue() < min) {
	            min = m.getValue();      
	            leastChar = m.getKey(); 
	        }
	    }
	    System.out.println("Least frequent character: " + leastChar + " with frequency: " + min);
	}

	public static void possibility() {
		int arr[]= {1,10,100,101,1000,1001,1010,10000,10001,10010};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a1[]=new int[n];
		for(int i=0;i<n;i++) {
			a1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[a1[i]-1]);
		}

	
		
		
	}
	public static void magnet() {
		StringBuilder s=new StringBuilder("SNNSN");
		int nc=0,sc=0;
		int an=0;
		int t=0;
		if(s.charAt(0)=='S') {
			
			an++;
			
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='N') {
				nc++;
			
			}else {
				sc++;
			}
		}
		
		if(nc>sc) {
			t=nc+an-sc+an;
		}else {
			t=nc+sc-an+an;
		}
		System.out.print(t);
	}
	public static void majority() {
		Map<Integer,Integer> h1=new HashMap<>();
		int []arr= {5,1,4,5,1,2,1,1,1};
		int n=arr.length;
		for(int a:arr) {
			if(!h1.containsKey(a)) {
				h1.put(a,1);
			}else {
				h1.put(a, h1.get(a)+1);
			}
			
		}
		 for(Map.Entry m : h1.entrySet()) {
			 
			if((int)m.getValue()>n/2) {
				System.out.print(m.getKey());
				
			}
		}
		
			
		
		
	}
	public static void password() {
		StringBuilder s1=new StringBuilder("hackerrank");
		StringBuilder s2=new StringBuilder("mountain");
		StringBuilder s=new StringBuilder();
		if(s1.length()>s2.length()) {
			for(int i=0;i<s2.length();i++) {
				s.append(s1.charAt(i)).append(s2.charAt(i));
			}
			
		}
		System.out.print(s);
	}
	public static void alpha() {
		String str="abaacbca";
		StringBuilder s=new StringBuilder();
		char[] c=str.toCharArray();
		for(int i=1;i<c.length;i++) {
			if(c[i-1]-c[i]==1) {
				char temp=c[i-1];
				c[i-1]=c[i];
				c[i]=temp;
				
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		
		
		
	}
	public static void sales() {
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
				
			}
			System.out.print(max+" ");
			
		}
	}
	public static int height() {
		int[]arr= {1,2,1,3,3,4,3};
		int[] temp=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		
		}
		Arrays.sort(temp);
		for(int i=0;i<arr.length;i++) {
			if(temp[i]!=arr[i]) {
				count++;
			}
		}
		
		return count;
		
	}
	public static void rat() {
		int r=2;
		int unit=7;
		int arr[]= {};
		int sum=0,count=0;
		if(arr==null) {
			System.out.print(-1);
		}
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
			count++;
			if(sum>=r*unit) {
				break;
			}
		}
		if(sum<r*unit) {
			System.out.print(0);
		}
		System.out.println("count:"+count);
		System.out.println("sum:"+sum);
	}
	public static void binary() {
		String str="1c0c1c1a0b1";
		str.toCharArray();
		if(str==null) {
			System.out.print(-1);
		}
		int res=str.charAt(0)-'0';
		for(int i=1;i<str.length();) {
			char ch=str.charAt(i);
			i++;
			if(ch=='a') {
				res=res & (str.charAt(i)-'0');
			}else if(ch=='b') {
				res=res | (str.charAt(i)-'0');
			}else {
				res=res ^ (str.charAt(i)-'0');
			}
			i++;
		}
		System.out.println(res);
		
	}
}
