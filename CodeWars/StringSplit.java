package CodeWars;

public class StringSplit {
    public static String[] solution(String s) {
        //Write your code here
      String newStringArray;
      String newString = s;
        if(s.length() % 2 != 0){
          newString = newString.concat("_");
        }
      for(int i = 0; i < newString.length(); i=i+2){
        newStringArray.add(newString.substring(i,i+1));
      }
    }
}