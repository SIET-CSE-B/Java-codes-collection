import java.util.Scanner;

public class example {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String num=scan.nextLine();
        if(num.equals("red")){
            System.out.println("Stop");
        }else if(num.equals("yello")){
            System.out.println("Ready");
        }else if(num.equals("green")) {
            System.err.println("Go");


    }
}
}
