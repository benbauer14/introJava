package ArrayList;

//import ArrayList to create arrays with no requirement on number of index
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // initialize and create sherlocksToTodos arraylist
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    //adds item to arraylist
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("listen to Dr. Watson for amusement");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    //removes item from arraylist
    sherlocksToDos.remove("visit the crime scene");
    
    // Calculate to-dos until case is solved:
    System.out.println(sherlocksToDos.indexOf("solve the case"));
      
    // Change the value printed:
    System.out.println("PRINT THE ANSWER HERE");

  }
  
}