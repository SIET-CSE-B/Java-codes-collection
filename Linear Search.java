import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=-0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int num=in.nextInt();
        int i,count=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                count++;
                break;
            }
        }
        if(count==1)
        System.out.println("Element "+num+" is present at location "+i);
        else{
        System.out.println("Element not found");
        i--;}
        if(i==0)
        {
            System.out.print("Best Case");
        }
        else if(i==n-1)
        {
            System.out.print("Worst Case");
        }
        else{
            System.out.print("Average Case");
        }
    }
}
