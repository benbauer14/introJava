public class Kata
  //Takes all numbers in array and squares the number and adds to total
  //[1, 2, 2] returns 9
 {
  public static int squareSum(int[] n)
  { 
   //Your Code
    int total = 0;
    for(int i = 0; i < n.length; i++){
      total = total + n[i]*n[i];
    }
    return total;
  }
 }
