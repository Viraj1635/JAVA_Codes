import java.lang.ProcessBuilder.Redirect.Type;
import java.util.*;
public class lab6_3 {
    public static void main(String[] args) {
        Bank_Account a1 = new Bank_Account();
        a1.GetAccountDetails();
        a1.DisplayAccountDetails();
    }
}

class Bank_Account{
    int Account_No;
    String User_Name;
    String Email;
    String Type;
    double Balance;

    public void GetAccountDetails(){
        Scanner can=new Scanner(System.in);
        System.out.print("Account_No :");
        Account_No=can.nextInt();
        can.nextLine();
        System.out.print("enter user_name:");
        User_Name=can.nextLine();
        System.out.print("enter Email:");
        Email=can.nextLine();
        System.out.print("enter Account type:");
        Type=can.nextLine();
        System.out.print("enter Balance:");
        Balance=can.nextDouble();
    }

    public void DisplayAccountDetails(){
        System.out.println(Account_No+" "+User_Name+" "+Email+" "+Type+" "+Balance);
    }
}
