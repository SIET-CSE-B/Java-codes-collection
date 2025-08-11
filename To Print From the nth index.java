import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int t=sc.nextInt();
        int index=-1;
        if(t>=0&&t<=str.length()){
        for(int i=t;i<str.length();i++){
          System.out.print(str.charAt(i));
        }
        }else{
            System.out.print(""+index);
        }
    }
}