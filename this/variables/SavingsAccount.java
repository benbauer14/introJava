public class SavingsAccount{

    public String owner;
    public int balanceDollar;
    public double balanceEuro;
  
    //Calling a variable with keyword this references the instance variable instead of the local variable
    //Java defaults variable identification to the local state unless this is called


    public SavingsAccount(String owner, int balanceDollar){
      // Complete the constructor
      //this.owner is setting the global owner value to the local parameter variable
      this.owner = owner;
      //this.balanceEuro sets global balanceEuro = to instance parameter variable * 0.85
      this.balanceEuro = balanceDollar * 0.85;
      this.balanceDollar = balanceDollar;
    }
  
    public void addMoney(int balanceDollar){
      // Complete this method
      System.out.println("Adding " + balanceDollar + " dollars to the account.");
      this.balanceDollar = this.balanceDollar + balanceDollar;
      System.out.println("The new balance is " + this.balanceDollar + " dollars.");
    }
  
    public static void main(String[] args){
      SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);
  
      // Make a call to addMoney() to test your method
      zeusSavingsAccount.addMoney(2000);
    }
  
  }