import java.util.Scanner;
 class fun{
    void sub(int a,int b){
        System.out.println(a-b);
    }
    public static void main(String arsg[]){
        Scanner scan=new Scanner(System.in);
        fun ob=new fun();
        int c=scan.nextInt();
        int d=scan.nextInt();
        ob.sub(c,d);
    }
 } 