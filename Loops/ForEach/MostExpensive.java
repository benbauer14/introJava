package Loops.ForEach;

import java.util.ArrayList;

class MostExpensive {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double mostExpensive = 0;
    
    // Iterate over expenses
    //for each (double) expense in expenses
    for(double expense:expenses){
        //finds most expensive
      if(expense > mostExpensive){
        mostExpensive = expense;
      }
    }
    
    System.out.println(mostExpensive);
    
  }
  
}