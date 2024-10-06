import java.util.Scanner;

public class TryItYourSelf {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int bT=b;
		b=a;
		a=c;
		c=bT;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		count();
		binary();
		decimal();
		divisor();
		sum();
		max();
		//min();
		reverse();
		marksCount();
	    marksRange();
		vowels();
		concat();
		order();
		duplicate();
		maxval();
		find();
	}
   public static void find() {
	   Scanner scanner = new Scanner(System.in);
	   int[] array = new int[6];
	   for (int i = 0; i < 5; i++) {
           array[i] = scanner.nextInt();
       }
	   int X = scanner.nextInt();
	   boolean found = false;
       for (int i = 0; i < 5; i++) {
           if (array[i] == X) {
               System.out.println("Number " + X + " found at position: " + i);
               found = true;
           }
       }
       if (!found) {
           System.out.println("Number " + X + " not found in the array.");
       }
   }
	
	public static void maxval() {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[6];
		for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
		int maxValue = array[0];
        int firstPosition = 0;
        int lastPosition = 0;
        for (int i = 1; i < 5; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                firstPosition = i;
                lastPosition = i;
            } else if (array[i] == maxValue) {
                lastPosition = i;
            }
        }
        System.out.println("Maximum value: " + maxValue);
        System.out.println("First occurrence position: " + firstPosition);
        System.out.println("Last occurrence position: " + lastPosition);
    }
	
	
	public static void duplicate() {
		Scanner sc=new Scanner(System.in);
		int a[]=new int [6];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int temp[]=new int[6];
		int j=0;
		for(int i=0;i<5;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[a.length-1];
		for(int i=0;i<j-1;i++) {
			System.out.println(temp[i]);
		}
		
	}
	
	public static void order() {
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void concat() {
		Scanner sc=new Scanner(System.in);
		String one=sc.nextLine();
		String two=sc.nextLine();
		String three=one+two;
		System.out.println(three);
		
	}
	
	public static void vowels() {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char cArray[]=s.toCharArray();
		boolean vo=false;
		for(int i=0;i<cArray.length;i++) {
			if(isvowel(cArray[i])) {
				cArray[i]='z';
				vo=true;
			}
		
		}
		String ne=new String(cArray);
		if(vo) {
			System.out.println(ne);
		}else {
			System.out.println("no vowels");
			
		}
	}
		public static boolean isvowel(char c){
			return "aeiouAEIOU".indexOf(c)!=-1;
		}
		
	
	public static void marksRange() {
		Scanner sc=new Scanner(System.in);
		int mRange[]=new int [11];
		for(int i=0;i<30;i++) {
			int marks=sc.nextInt();
			int range=marks/10;
			mRange[range]++;
			
		}
		for(int i=0;i<10;i++) {
			System.out.println("Students with"+i+"marks="+mRange[i]);
		}
	}
	
	public static void marksCount() {
		Scanner sc=new Scanner(System.in);
		int mCount[]=new int [101];
		for(int i=0;i<30;i++) {
			int marks=sc.nextInt();
			mCount[marks]++;
		}
		for(int i=0;i<100;i++) {
			System.out.println("Students with"+i+"marks="+mCount[i]);
		}
	}
	
	public static void reverse() {
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		int n=a.length;
		for(int i=0;i<n/2;i++) {
			int temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
		}
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		
	}
	
     public static void max() {
    	 Scanner sc=new Scanner(System.in);
    	 int a[]=new int [20];
    	 int max1=Integer.MIN_VALUE;
    	 int max2=Integer.MIN_VALUE;
    	 int max3=Integer.MIN_VALUE;
    	 for(int i=0;i<5;i++) {
    		 a[i]=sc.nextInt();
    		 }
    	 for(int num:a) {
    		 if(num>max1) {
    			 max3=max2;
    			 max2=max1;
    			 max1=num;
    		 }else if(num>max2) {
    			 max3=max2;
    			 max2=num;
    		 }else if(num>max3){
    			 max3=num;
    		 }
    		 
    	 }
    	 System.out.println(max1);
    	 System.out.println(max2);
    	 System.out.println(max3);
    	 
	}
     public static void min() {
    	 int a[]=new int [20];
 		
 	}
	
	
	public static void count() {
		Scanner sc=new Scanner(System.in);
		int count1=0;
		int a=sc.nextInt();
		while(a>0) {
			int rem=a%10;
			a=a/10;
			count1=count1+1;
			}
		System.out.println(count1);
	}
	public static void binary() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double value=0;
		int count=-1;
		while(a>0) {
			int rem=a%2;
			a=a/2;
			count=count+1;
			value=value+rem*(Math.pow(10, count));
		}
		System.out.println(value);
		
		
	}
	public static void decimal() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=-1;
		double value=0;
		while(a>0) {
			int rem=a%10;
			a=a/10;
			count=count+1;
			value=value+rem*(Math.pow(2, count));
			
			
		}
		System.out.print(value);
		
	}
	public static void divisor() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=2;i<=(int)(Math.sqrt(a));i++) {
			if(a%i==0) {
				System.out.println(i);
			}
		}
		
	}
	
	
	public static void sum() {
		int var[]=new int [10];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			var[i]=sc.nextInt();
		     sum=sum+var[i];
		     
		}
		System.out.println(sum);
		
	}

}
