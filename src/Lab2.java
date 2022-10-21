import java.util.Date;

class Account{
    private int id=0;
    private double balance=0;
    private static double annualInterestRate=0;
    private final Date dateCreated;
    Account(){
        dateCreated = new Date();
    }
    Account(int getid,double getbalance){
        id = getid;
        balance = getbalance;
        dateCreated = new Date();
    }
    public int getID(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public static void setAnnualInterestRate(double setannualInterestRate) {
        annualInterestRate = setannualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterest(){
        double monthlyInterestRate=annualInterestRate/12/100;
        return balance*monthlyInterestRate;
    }
    public boolean withDraw(double draw){
        if(balance>=draw){
            balance-=draw;
            return true;
        }
        else return false;
    }
    public void deposit(double draw){
        balance+=draw;
    }
}
public class Lab2 {
    public static void main(String[] args) {
        Account account1=new Account(1122,20000);
        account1.withDraw(2500);
        account1.deposit(3000);
        Account.setAnnualInterestRate(4.5);
        System.out.println("Account id "+account1.getID()+" Balance is "+account1.getBalance());
        System.out.println("Monthly interest is "+account1.getMonthlyInterest());
        Date date1=new Date();
        System.out.println("This account was created at "+date1);
        System.out.println("*****************************************");
        Account account2=new Account(2233,30000);
        System.out.println("Account id "+account2.getID()+" Balance is "+account2.getBalance());
        System.out.println("Monthly interest is "+account2.getMonthlyInterest());
        Date date2=new Date();
        System.out.println("This account was created at "+date2);
        System.out.println("*****************************************");
        Account.setAnnualInterestRate(3.95);
        System.out.println("Account id "+account1.getID()+" Monthly interest is "+account1.getMonthlyInterest());
        System.out.println("Account id "+account2.getID()+" Monthly interest is "+account2.getMonthlyInterest());
    }
}
