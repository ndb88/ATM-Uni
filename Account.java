import java.text.DecimalFormat;
import java.util.*;

public class Account {

  Scanner input = new Scanner(System.in);
  DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

  public int setAccountNumber(int accountNumber){
    this.accountNumber = accountNumber;
    return accountNumber;
  }

  public int getAccountNumber(){
    return accountNumber;
  }

  public int setPinNum(int pinNum){
    this.pinNum = pinNum;
    return pinNum;
  }

  public int getPinNum(){
    return pinNum;
  }

  public double getCheckBalance(){
    return checkBalance;
  }

  public double getSaveBalance(){
    return saveBalance;
  }

  public double calcCheckWithdraw(double amount){
    checkBalance = (checkBalance - amount);
    return checkBalance;
  }

  public double calcSaveWithdraw(double amount){
    saveBalance = (saveBalance - amount);
    return saveBalance;
  }

  public double calcCheckDeposit(double amount){
    checkBalance = (checkBalance + amount);
    return checkBalance;
  }

  public double calcSaveDeposit(double amount){
    saveBalance = (saveBalance + amount);
    return saveBalance;
  }

  public void getCheckWithdrawInput(){
    System.out.println("Balance of Checking Account is: " + moneyFormat.format(checkBalance));
    System.out.print("Checking Account withdrawal amount: ");
    double amount =input.nextDouble();

    if((checkBalance-amount)>=0){
      calcCheckWithdraw(amount);
      System.out.println("Current Checking Account Balance: " + moneyFormat.format(checkBalance));
      }else{
      System.out.println("Balance Cannot be Negative." + "\n");
      }
    }

    public void getsaveWithdrawInput(){
      System.out.println("Balance of Saving Account is: " + moneyFormat.format(saveBalance));
      System.out.print("Saving Account withdrawal amount: ");
      double amount =input.nextDouble();

      if((saveBalance-amount)>=0){
        calcSaveWithdraw(amount);
        System.out.println("Current Saving Account Balance: " + moneyFormat.format(saveBalance));
        }else{
        System.out.println("Balance Cannot be Negative." + "\n");
        }
      }

      public void getCheckDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkBalance));
        System.out.print("Amount you want to Deposit from Checking Account: ");
        double amount =input.nextDouble();

        if((checkBalance+amount)>=0){
          calcCheckDeposit(amount);
          System.out.println("New Checking Account Balance: " + moneyFormat.format(checkBalance));
          }else{
          System.out.println("Balance Cannot be Negative." + "\n");
          }
        }

        public void getSaveDepositInput(){
          System.out.println("Saving Account Balance: " + moneyFormat.format(saveBalance));
          System.out.print("Amount: ");
          double amount =input.nextDouble();

          if((saveBalance+amount)>=0){
            calcSavingDeposit(amount);
            System.out.println("Current saving Account Balance: " + moneyFormat.format(saveBalance));
            }else{
            System.out.println("Balance Cannot be Negative." + "\n");
            }
          }

        private int customerNumber;
        private int pinNumber;
        private double checkingBalance = 0;
        private double savingBalance = 0;
}