
//must import Arrays library to use arrays
//Arrays are created with a fixed number of indexes that can not be changed once created.
import java.util.Arrays;

public class Classroom {
  
  public static void main(String[] args){
    //creates array with four values
    String[] students = {"Sade", "Alexus", "Sam", "Koma"};
    //creates an empty array with fixed number of indexes
    double[] mathScores = new double[4];
    //updates values in different positions
    mathScores[0] = 94.5;
    mathScores[2] = 76.8;
    //counts values in array
    System.out.println("The number of students in the class is " + students.length + ".");
  }

}
