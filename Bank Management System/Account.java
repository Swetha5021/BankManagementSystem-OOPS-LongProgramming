import java.util.*;
class Account
{
    private String name;
    private String addr;
    private String phoneno;
    private String aadhar;
    private String dob;
    private int balance;
    int acc_no=70780;
    
    ArrayList<Account> acc = new ArrayList<>();
    
    public Account(String name, String addr,String phoneno,String aadhar,String dob,int balance,int acc_no)
    {
        this.name=name;
        this.addr=addr;
        this.phoneno=phoneno;
        this.aadhar=aadhar;
        this.dob=dob;
        this.balance=balance;
        this.acc_no=acc_no;
    }
    public void createAccount()
    {
        acc.add(new Account(name,addr,phoneno,aadhar,dob,balance,acc_no));
        System.out.println("---------------------------------");
        System.out.println("Account created successfully.");
        System.out.println("Your Account no: "+acc_no);
    }
    public int getAccountNumber()
    {
        return acc_no;
    }
    public int getBalance(int acc_no)
    {
        return balance;
    }
}