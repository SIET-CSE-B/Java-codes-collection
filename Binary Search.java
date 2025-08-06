import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=in.nextInt();
		}
		int left=0,right=n-1;
		int mid=0,count=0,c=0;
		int target=in.nextInt();
		while(left<=right)
		{
		    c++;
		    mid=left+(right-left)/2;
		    if(arr[mid]==target)
		    {
		        count++;
		        break;
		    }
		    else if(target>mid)
		    {
		        left=mid+1;
		    }
		    else{
		        right=mid-1;
		    }
		}
		if(count == 1)
		{
		    System.out.println(target+" found at location "+mid);
		}
		else{
		    System.out.println("Not found");
		}   
		System.out.print(c+" comparisons are done");
	}
}
