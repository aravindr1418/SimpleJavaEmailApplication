package EmailApplication;

import java.util.Scanner;

public class EmailApp {
        private String firstName;
        private String lastName;
        private String password;
        private String department;
        private String Email;
        private int mailboxCapacity = 500;
        private String alternateEmail;

        public EmailApp(String firstName,String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
          //  System.out.println("Email created "+this.firstName+" "+this.lastName);
            this.department = setDepartment();
           // System.out.println("Your department is "+this.department);
            this.password = randomPasswordGenerator(8);
          // System.out.println("Your password is "+this.password);
            Email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+".aeycompany.com";
         //   System.out.println("Your email is "+Email);
        }

    private String randomPasswordGenerator(int length) {
        String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwzyx1234567890;:.><,%$#^@!";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random()*setPassword.length());
            password[i] = setPassword.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity){
            this.mailboxCapacity = capacity;
        }

         public void setAlternateEmail(String altemail){
            this.alternateEmail = altemail;
         }

         public void changePassword(String password){
            this.password = password;
         }

         public int getMailboxCapacity(){return mailboxCapacity;}
         public String getAlternateEmail(){
            return alternateEmail;
         }
         public String password (){
            return password;
        }

    private String setDepartment(){
        System.out.println("Enter the department " +
                "\n1 for sales " +
                "\n2 for development " +
                "\n3 for Accounting"+"\n0 for none");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if(deptChoice == 1)
            return "Sales";
        else if (deptChoice == 2){
            return "Development";
        }
        else if(deptChoice == 3)
            return "Accounting";
        else{
            return "";
    }

}
      public String showInfo(){
            return "UserName: "+firstName+" "+lastName+"\nCompanyEmail is "+Email+" and your password is "+password;
      }

}
