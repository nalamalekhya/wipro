import java.util.Scanner;

public class Pattern1 {
	
	
	 public static void pattern1(int n) {
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
				 
			 }
			 System.out.print("\n");
		 }
		 
	}
	 
	 public static void pattern2(int n) {
		 for(int i=n;i>=1;i--) {
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
				 
			 }
			 System.out.print("\n");
		 }
		 
	 }
	 
	 public static void pattern3(int n) {
		 for(int i=n;i>=1;i--) {
			 for(int j=1;j<=i;j++) {
				 System.out.print(n-j+1);
				 
			 }
			 System.out.print("\n");
		 }
		 
	 }
	 
	 public static void pattern4(int n) {
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n-i;j++) {
				 System.out.print(" ");
				 
			 }
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.print("\n");
		 }
		 
	 }
	 
	 public static void pattern5(int n) {
		 for (int i=1;i<=n;i++) {
			 for(int j=1;j<=n-i;j++) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
			 }
			 for (int j=i-1;j>=1;j--) {
				System.out.print(j); 
			 }
			 System.out.print("\n");
		 }
	 }
	 public static void pattern6(int n) {
		 for (int i=1;i<=n;i++) {
			 for(int j=1;j<=n-i;j++) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
			 }
			 for (int j=i-1; j>=1;j--) {
				 
				 System.out.print((char)('A'+(j-1)));
			 }
			 System.out.print("\n");
		 }
		 
	 }
	 
	 public static void pattern7(int n) {
		 for (int i=1;i<=n;i++) {
			 for (int j=1; j<=n-i;j++) {
	                System.out.print(" ");
	            }
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
			 }
			 for(int j=i-1; j>=1;j--) {
				 System.out.print(j);
			 }
			 System.out.print("\n");
		 }
		  for(int i=n-1;i>=1;i--) {
			  for(int j=1;j<=n-i;j++) {
				  System.out.print(" ");
			  }
			  for(int j=1;j<=i;j++) {
				  System.out.print(j);
			  }
			  for(int j=i-1;j>=1;j--) {
					 System.out.print(j);
				 }
			  System.out.print("\n");
		  }
		 }
		 
	 
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value:");
		int n=sc.nextInt();
		pattern1(n);
		pattern2(n);
		pattern3(n);
		pattern4(n);
		pattern5(n);
		pattern6(n);
		pattern7(n);
		
		sc.close();
		
		

	}

}
