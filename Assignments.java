import java.util.Scanner;

public class Assignments {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		check(a);
		boolean res=lastdigit(a,b);
		System.out.println(res);
		type(a);
		char c=sc.next().charAt(0);
		char d=sc.next().charAt(0);
		switch(c) {
		case 'R':System.out.print("Red");
		         break;
		case 'B':System.out.print("Blue");
        break;
		case 'G':System.out.print("Green");
        break;
		case 'o':System.out.print("orange");
        break;
		case 'Y':System.out.print("yellow");
        break;
		case 'W':System.out.print("white");
        break;
        default:System.out.print("Invalid -code");
		}
		chars(c,d);
		checkType(c);
		convert(c);
		
		for (int i=1;i<=10;i++) {
			System.out.print(i+"\t");
		}
		for(int i=23;i<57;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
			
		}
		int count=0;
		for(int i=10;i<100;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count+=1;
				}
				
				
			}if(count==0) {
				System.out.println(i);
			}
		
			count=0;
		}
		//prime(a);
		for(int i=0;i<3;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		int resu=sum(a);
		System.out.println(resu);
		reverse(a);
		sc.close();
		
		

	}
	
	public static void reverse(int a) {
		int rem,cou=0;
		int rev=0;
		while(a>0) {
			rem=a%10;
			a=a/10;
			rev =rev*10+rem;
			cou++;
			
			
		}
		System.out.println(rev);
	}
	
	public static int sum(int a) {
		int sum=0;
		while(a>0) {
			int rem=a%10;
			a=a/10;
			sum+=rem;
		}
		return sum;
		
		}
	
	public static void prime(int a) {
		int count=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				count+=1;
			}
		}
		if(count==0) {
				System.out.print("prime");
			}else {
				System.out.print("notprime");
			}
		}
	
	
	
	
	
	public static void convert(char c) {
		if(Character.isUpperCase(c)) {
			System.out.print(c+"->"+Character.toLowerCase(c));
		}else {
			System.out.print(c+"->"+Character.toUpperCase(c));
		}
	}
	
	
	public static void checkType(char c) {
		if(Character.isLetter(c)) {
			System.out.print("alphabet");
		}else if(Character.isDigit(c)) {
			System.out.print("digit");
		}else {
			System.out.print("speial character");
		}
	}
	
	public static void chars(char c,char d) {
		if(c<d) {
			System.out.print(c+","+d);
		}else {
			System.out.print(d+","+c);
		}
	}
	
	
	
	public static void type(int a) {
		if(a%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
		
	}
	public static void check(int a) {
		if(a>0) {
			System.out.println("POsitive");
		}else if(a<0) {
			System.out.println("negative");
		}else {
			System.out.println("zero");
		}
		
	}
	
	public static boolean lastdigit(int a ,int b) {
		
		return (a%10)==(b%10);
		
	}

}
