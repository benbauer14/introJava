public class Solution {
  //https://www.codewars.com/kata/56453a12fcee9a6c4700009c/train/java

  public static int closeCompare(double a, double b) {
    if(a-b > 0){
      return 1;
    } else if( a-b < 0){
      return -1;
    }else{
    return 0; // TODO
    }
  }
  
  public static int closeCompare(double a, double b, double margin) {
    if(Math.abs(a-b) <= margin){
     return 0; 
    }
        if(a-b > 0){
      return 1;
    } else if( a-b < 0){
      return -1;
    }else{
    return 0; // TODO
    }
  }
}
