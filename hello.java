import java.util.Scanner;
class hello{
    public static void main(String args[]){
        Scanner m = new Scanner(System.in);
        int n1=m.nextInt();
        int n2=m.nextInt();
        if(n1>n2){
            System.out.println("Number "+n1+" is greatest");
        }else{
            System.out.println("Number "+n2+" is greatest");
        }
    }
}