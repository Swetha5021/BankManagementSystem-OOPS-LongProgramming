import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Bank Management System");
		int choice=1;
		int acc_no = 70780;
		while(choice!=3)
		{
		    System.out.println("---------------------------------");
		    System.out.println("1: Create account");
		    System.out.println("2: Transaction - Withdraw/Deposit");
		    System.out.println("3: Exit");
		    System.out.println("---------------------------------");
		    choice = sc.nextInt();
		    if(choice==1)
		    {
		        System.out.println("Enter user details");
		        System.out.println("Enter your name:");
		        String name = sc.next();
		        System.out.println("Enter your addrress:");
		        String addr = sc.next();
		        System.out.println("Enter your phone no:");
		        String phoneno=sc.next();
		        System.out.println("Enter your Aadhar no:");
		        String aadhar = sc.next();
		        System.out.println("Enter your DOB:");
		        String dob=sc.next();
		        Account acc = new Account(name,addr,phoneno,aadhar,dob,0,acc_no);
		        acc.createAccount();
		    }
		    else if(choice==2)
		    {
		        System.out.println("Enter the details");
		        System.out.println("Enter Account Number:");
		        int acc_num = sc.nextInt();
		        System.out.println("Enter the amount:");
		        int amount =sc.nextInt();
		        System.out.println("Enter your balance amount:");
		        int balance = sc.nextInt();
		        System.out.println("Would you like to Withdraw or Deposit:");
		        System.out.println("1: Deposit");
		        System.out.println("2: Withdraw");
		        int transaction_choice = sc.nextInt();
		        if(transaction_choice == 1)
		        {
		            Deposit deposit = new Deposit(acc_num,amount,balance);
		            deposit.depositAmount();
		            deposit.getDepositStatus();
		            deposit.getBalance();
		        }
		        else if(transaction_choice == 2)
		        {
		            Withdraw withdraw = new Withdraw(acc_num,amount,balance);
		            withdraw.withdrawAmount();
		            withdraw.getWithdrawStatus();
		            withdraw.getBalance();
		        }
		        else
		        System.out.print("Invalid choice");
		    }
		    else
		    System.out.println("Invalid choice");
		}
	}
}
