import java.util.Arrays;

public class DynamicPrograming {

	public static void main(String[] args) {
		//coin();
		// boolean res=triplet();
		 //System.out.print(res);
		//waterTrapped();
		//sum();
		maxsum();
 
	}
	public static void maxsum() {
		int a[]= {1,3,-1,-10,10,5};
		int max=a[0];
		int current=a[0];
		for(int i=1;i<a.length;i++) {
			current=Math.max(a[i], current+a[i]);
			max=Math.max(current, max);
		}
		System.out.print(max);
	}
	
	public static void sum() {
		int a[]= {2,3,4};
		Arrays.sort(a);
		int count=0;
		int sum=0;
		for(int i=a.length-1;i>=2;i--) {
			int c=a[i];
			int left=0;
			int right=i-1;
			while(left<right) {
				sum=a[left]+a[right];
				if(sum==c) {
					count++;
					left++;
					right--;
				}else if(sum<c) {
					left++;
				}else{
					right--;
				}
			}
			
		}
		System.out.println(count);
	}
	public static void waterTrapped() {
		int a[]= {3,0,0,2,0,4};
		int left[]=new int[a.length];
		int right[]=new int[a.length];
		left[0]=a[0];
		for(int i=1;i<a.length;i++) {
			left[i]=Math.max(left[i-1], a[i]);
			System.out.println("left"+left[i]);
		}
		right[a.length-1]=a[a.length-1];
		for(int i=a.length-2;i>=0;i--) {
			right[i]=Math.max(right[i+1],a[i]);
			System.out.println(right[i]);
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=Math.min(left[i],right[i])-a[i] ;
		}
		System.out.print(sum);
	}
	public static boolean triplet() {
		int a[]= {3,8,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]*a[i];
		}
		Arrays.sort(a);
		for(int i=a.length-1;i>=2;i--) {
			int c=a[i];
			int left=0;
			int right=i-1;
			while(left<right) {
				sum=a[left]+a[right];
				if(sum==c) {
					return true;
				}else if(sum<c) {
					left++;
				}else {
					right--;
				}
			}
		}

		return false;
		
	}
	public static void coin() {
		int n=4;
		int a[]= {5,2,3,6};
		int sum=10;
		int dp[]=new int[sum+1];
		dp[0]=1;
		for(int coin:a) {
			for(int i=coin;i<=sum;i++) {
				dp[i]+=dp[i-coin];
				
			}
		}
		System.out.println(dp[sum]);
	}

}
