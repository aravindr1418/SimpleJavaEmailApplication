package EmailApplication;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fname = in.next();
        System.out.println("Enter your last name:");
        String lname = in.next();
        EmailApp name = new EmailApp(fname,lname);
        System.out.println(name.showInfo());
    }

}
