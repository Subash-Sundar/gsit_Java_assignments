package gsitWeeklyAssignments.keywordsAssignments;

public class BankAccount
{
    final String ACCOUNT_TYPE = "Savings";
    long accountNumber;
    String accountholderName;
    double balance;
    BankAccount(long accountNumber,String accountholderName,double balance)
    {
        this.accountNumber = accountNumber;
        this.accountholderName = accountholderName;
        this.balance = balance;
        //this.ACCOUNT_TYPE = "Trading";

    }
    void displayAccountDetails()
    {
        System.out.println("Account Details");
        System.out.println("-----------------------------");
        System.out.println("Account type: "+ACCOUNT_TYPE);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account holder: "+accountholderName);
        System.out.println("Balance: "+balance);

    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100498L,"Subash",50000.80);
        account.displayAccountDetails();
    }
}
