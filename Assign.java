import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assign {

	public static void main(String[] args) {
		//int arr[]={65,66,66,67,69,68,99,97};
		//maxmin();
		//find(arr);
		//Ascii(arr);
		//maxmin2(arr);
		//int[] a=sort(arr);
		//System.out.println(a);
		//duplicate(arr);
		//ignore();
		//ten();
		//evenodd(arr);
		//CountZero();
		//int res=smallPrime();
		//System.out.print(res);
		//int res=pin();
		//System.out.print(res);
		//int res=pin1();
		//System.out.print(res);
		//String s=Roman();
		//System.out.println(s);
		//wipro1();
		//reverse();
		int[] tot= DSsum();
		System.out.print(tot[0]);
		System.out.print(tot[1]);
		
		
		
		
	}
	public static int[] DSsum() {
		int arr[]= {1,2,3,4,5};
		int target=5;
		Map<Integer,Integer> tot=new HashMap<>();
		Map<Integer,Integer> res=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			res.put(arr[i],i );
		}
		for(int i=0;i<arr.length;i++) {
			if(res.containsKey(target-arr[i])) {
			  return new int[] {( res.get(target-arr[i])),i}	;
			}
		}
		return new int[] {} ;
	}
	
	public static void reverse() {
		String str="alekhya";
		char ch[]=str.toCharArray();
		for(int i=0;i<(ch.length)/2;i++) {
			char temp=ch[ch.length-i-1];
			ch[ch.length-i-1]=ch[i];
			ch[i]=temp;
			
		}
		for(int i=0;i<(str.length());i++) {
			System.out.print(ch[i]);
		}
		for(int i=(str.length()-1);i>0;i--) {
			System.out.print(ch[i]);
		}
		
	}
	public static String Roman() {
		int a=3496;
		int values[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String roman[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuilder s=new StringBuilder();
		for(int i=0;i<values.length;i++) {
			while(a>=values[i]) {
				s.append(roman[i]);
				a-=values[i];
				
			}
		}
		return s.toString();
	}
	
	public static void wipro1() {
		
	}
	public static int pin1() {
		int input1=3521;
		int input2=2452;
		int input3=1352;
		int input4=38;
		int a=small(input1);
		int b=large(input2);
		int c=large(input3);
		return a*b*c+input4;
	}
	public static int small(int a) {
		int small=Integer.MAX_VALUE;
		while(a>0) {
			int rem=a%10;
			if(rem<small) {
				small=rem;
			}
			a=a/10;
		}
		
		return small;
	}
	public static int large(int a) {
		int small=Integer.MIN_VALUE;
		while(a>0) {
			int rem=a%10;
			if(rem>small) {
				small=rem;
			}
			a=a/10;
		}
		
		return small;
	}
	public static int pin() {
		
		int input1=3521;
		int input2=2452;
		int input3=1352;
		int input4=37;
		int a=0,b=0,c=0;
		if(input4%2==0) {
			 a=SumofEven1(input1);
			 b=SumofEven1(input2);
			 c=SumofEven1(input3);
			 return a+b+c; 
		}else {
			a=Sumofodd(input1);
			 b=Sumofodd(input2);
			 c=Sumofodd(input3);
		  return a+b+c;	
		}
		
		
	}
	public static int SumofEven(int a) {
		int sum=0,i=0;
		char[] b=Integer.toString(a).toCharArray();
		while(i<b.length) {
			sum+=Character.getNumericValue(b[i]);
			System.out.println(Character.getNumericValue(b[i]));
			i=i+2;
		}
		return sum;
	}
	
	public static int SumofEven1(int a) {
		int sum=0;
		while(a>0) {
			int rem=a%10;
			if(rem%2==0) {
				sum=sum+rem;
				System.out.println(rem);
			}
			a=a/10;
			
		}
		return sum;
	}
	public static int Sumofodd(int a) {
		int sum=0;
		while(a>0) {
			int rem=a%10;
			if(rem%2!=0) {
				sum=sum+rem;
				System.out.println(rem);
			}
			a=a/10;
			
		}
		return sum;
	}
	public static int smallPrime() {
		int sum=0;
		int small=Integer.MAX_VALUE;
		boolean hasprimes=false;
		int a[]= {10,20,30,40};
		for(int i=0;i<a.length;i++) {
			if(isprime(a[i])) {
			 	hasprimes=true;
			 	sum=sum+a[i];
			 	System.out.println(a[i]);
			 	if(a[i]<small) {
			 		small=a[i];
			 	}
			}
			
		}
		
		if(hasprimes) {
			return sum-small;
		}else {
			for(int i=0;i<a.length;i++) {
				sum=sum+a[i];
				if(a[i]<small) {
					small=a[i];
				}
			}
			return sum-small;
		}
		
	}
	public static boolean isprime(int a) {
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void CountZero() {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int a=sc.nextInt();
		int min=(int) (Math.pow(10, a-1));
		int max=(int) (Math.pow(10, a));
		for(int i=min;i<max;i++) {
			if(isZero(i)) {
				count++;
			}
		}
		
		
		System.out.println(count);
		
	}
	public static boolean isZero(int n) {
		int count=0;
		while(n>0) {
			
			int rem=n%10;
			if(rem==0) {
				count++;
			}n=n/10;
			
		}if(count>=2) {
			return true;
		}
		else {
		
		
		return false;
		}
	}
	
	
	
	
	
	public static void evenodd(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (left < right && array[left] % 2 == 0) {
                left++;
            }while (left < right && array[right] % 2 != 0) {
                right--;
            }if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }for(int k=0;k<array.length;k++) {
			System.out.println(array[k]);
		}
	}
	
	public static void ten() {
		int[] a= {1,10,10,2};
		int[] temp=new int [a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=10) {
				temp[j++]=a[i];
			}
		}temp[j++]=a[a.length-1];
		for(int i=0;i<a.length;i++) {
			System.out.println(temp[i]);
		}
	}
	
	public static void ignore() {
		int[] a= {1,2,6,5,4,7,3};
		int sum=0;
		boolean b=false;
		for(int num:a) {
			if(num==6) {
				b=true;
			}
			if(!b) {
				sum+=num;
			}
			if(num==7&&b) {
				b=false;
			}
		}System.out.println(sum);
	}
	
	public static void duplicate(int a[]) {
		int j=0;
		int temp[]=new int [a.length];
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
		}temp[j++]=a[a.length-1];
		for(int i=0;i<j;i++) {
			System.out.println(temp[i]);
		}
	}
	
	
	public static int[] sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		return arr;
	}
	
	
	public static void maxmin2(int arr[]) {
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int a:arr) {
			if(a>max1) {
				max2=max1;
				max1=a;
			}else if(a>max2) {
				max2=a;
			}
		}
		System.out.println(max1);
		System.out.println(max2);
	}
	
	public static void Ascii(int arr[]) {
		for(int a:arr) {
			System.out.println((char)a);
		}
		
	}
	public static void find(int arr[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element:");
		int a=sc.nextInt();
		int c=0;
		boolean b=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				b=true;
				c=i;
			}
		}if(b==true) {
			System.out.println(c);
		}else {
			System.out.println("-1");
		}
	}
	
	public static void maxmin() {
		Scanner sc=new Scanner(System.in);
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int arr[]=new int [11];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}else if (arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		
	}
	

}
