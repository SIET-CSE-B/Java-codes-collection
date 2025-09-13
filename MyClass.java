import java.util.Scanner;

public class MyClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age =sc.nextInt();
        int product = sc.nextInt();
        float price=sc.nextFloat();
        System.out.println("Name:   "+name);
        System.out.println("Age:    "+age);
        System.out.println("Product Quantity:   "+product);
        System.out.println("Price:  "+price);
          sc.close();
    }
}
