import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone = sc.nextLine();

        if (phone.matches("\\d{10}")) {
            System.out.println("Valid Mobile number");
        } else {
            System.out.println("Invalid mobile number");
        }

        sc.close();
    }
}