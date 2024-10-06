import java.util.Scanner;

public class HourPlan {
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  int num1=sc.nextInt();
    	  int d=SecondDigit( num1);
    	 int a= IsEven(num1);
    	 int b= IsOdd(num1);
    	 int c=lastDigit(num1);
    	 int e=Nthprime(num1);
    	 System.out.println(a);
    	 System.out.println(b);
    	 System.out.println(c);
    	 System.out.println(e);
    	 unique(num1);
    	 nonrepeated(num1);
    	 singlesum(num1);
      }
      
      public static void singlesum(int a) {
    	  boolean b=a<0;
    	  if(b) {
    	  a=-a;
    	  }
    	  while(a>9) {
    		  long sum=0;
    		  while(a>0) {
    			  sum+=a%10;
    			  a/=10;
    		  }
    		  a=(int)sum;
    	  }
    	  if(b) {
    		  a=-a;
    	  }
    	  System.out.println(a);
      }
      
      public static void nonrepeated(int a) {
    	 int[] d=new int[10];
    	  int c=0;
    	  while(a>0) {
    		  int rem=a%10;
    		  d[rem]++;
    		  a/=10;
    	  }
    	  for(int i=0;i<10;i++) {
    		  if(d[i]==1){
    			  c++;
    		  }
    	  }System.out.println(c);
      }
      
      public static void unique(int a) {
    	  boolean[] d=new boolean[10];
    	  int c=0;
    	  while(a>0) {
    		  int rem=a%10;
    		  if(!d[rem]) {
    			  d[rem]=true;
    			  c++;
    		  }a/=10;
    	  }
    	  System.out.println(c);
      }
      
      
      public static int Nthprime(int a) {
    	  int cou=-1;
    	  int num=0;
    	  while(a>cou) {
    		  num++;
    		  boolean isprime=true;
    		  for(int i=2;i<=Math.sqrt(num);i++) {
    			  if(num%i==0) {
    				  isprime=false;
    				  break;
    			  }
    		  }if(isprime) {
    			  cou++;
    		  }
    	  }
		return num;
    	  
      }
      public static int SecondDigit(int a) {
    	  a=Math.abs(a);
    	  if(a<10) {
    		  return -1;
    	  }
		return (a%100)/10;
    	  
      }
      
      public static int lastDigit(int a) {
		 if(a<0) {
			 a=a*-1;
		 }
    	  
    	  return a%10;
    	  
      }
      
      public static int IsOdd(int a) {
    	  if(a%2!=0) {
    		  return 2;
    	  }
		return 1;
    	  
      }
      
      public static int IsEven(int a) {
    	  if(a%2==0) {
    		  return 2;
    	  }
		return 1;
    	  
      }
}
