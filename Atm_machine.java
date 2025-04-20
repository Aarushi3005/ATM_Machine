import java.util.Scanner;
 class Atm{
    float balance;
    int PIN =5678;

    public Atm(float balance) {
        this.balance=balance;
    }
    
    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc =new Scanner(System.in);
int enteredpin=sc.nextInt();
if(enteredpin==PIN){
    menu();
}else{
    System.out.println("Enter a valid PIN");
}
    }

    public void menu(){
    System.out.println("Enter Your Choice:");
    System.out.println("1. Check Account Balance");
    System.out.println("2. Withdraw Money");
    System.out.println("3. Deposite Money");
    System.out.println("4. EXIT");

    Scanner sc=new Scanner(System.in);
    int opt=sc.nextInt();
        switch (opt) {
            case 1:
                checkBalance();
                menu();
            case 2:
                withdrawMoney();
                menu();
            case 3:
                depositeMoney();
                menu();
            case 4:
                break;
            default:
                System.out.println("Enter a Valid Choice");
                menu();
        }
    }

    private void checkBalance() {
        System.out.println("Balance: "+ balance);
        menu();
    }

    private void depositeMoney() {
        System.out.println("Enter the Amount: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        balance=balance+amount;
        System.out.println("Money Deposited Successfully");
    }

    private void withdrawMoney() {
        System.out.println("Enter Amount to Withdraw:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(balance>=amount){
            System.out.println("Insufficient Balance");
        }else{
            balance=balance-amount;
            System.out.println("Money Withdrawal Successful");
        }
        menu();
    }
}

public class Atm_machine{
    public static void main(String[] args) {
       Atm user=new Atm(98076);
       user.checkpin();
    }
}
