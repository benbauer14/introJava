package Variables.Static;

public class ATM{
    // Static variables are universal variables that are constant for all objects within class ATM. Any object called will return the same value.
    //for example newATM1.numATM returns 2 and newATM2.numATM returns 2
    public static int totalMoney = 0;
    public static int numATMs = 0;
  
    // Instance variables are variables that can have unique values for each object. 
    //for example newATM1.money = 1000 newATM2.money = 1500.
    public int money;
  
    public ATM(int inputMoney){
      this.money = inputMoney;
      numATMs += 1;
      totalMoney += inputMoney;
    }
  
    public void withdrawMoney(int amountToWithdraw){
      if(amountToWithdraw <= this.money){
        this.money -= amountToWithdraw;
        totalMoney -= amountToWithdraw;
      }
    }
  
    // Write your averageMoney() method here
    public static void averageMoney(){
      System.out.println(totalMoney / numATMs);
      //this line does not work. Cannot call a non-static variable within a static method
      System.out.println(this.money);
    }
  
    public static void main(String[] args){
  
      System.out.println("Total number of ATMs: " + ATM.numATMs); 
      ATM firstATM = new ATM(1000);
      ATM secondATM = new ATM(500);
      System.out.println("Total number of ATMs: " + ATM.numATMs); 
  
      System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);  
      firstATM.withdrawMoney(500);
      secondATM.withdrawMoney(200);
      System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);    
  
      // Call averageMoney() here
      averageMoney();
    }
  
  }