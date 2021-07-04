public class School{
  //https://www.codewars.com/kata/563e320cee5dddcf77000158/train/java

 	public static int getAverage(int[] marks){
    int sum = 0;
    for(int i = 0; i < marks.length; i++){
      sum += marks[i];
    }
    int average = sum/marks.length;
		return average;
	}

}
