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

    //edits value in index 1
    sherlocksToDos.set(1, "Dance slowly")
    
    //removes item from arraylist
    sherlocksToDos.remove("visit the crime scene");

    //retrieves value from specified index
    System.out.println(sherlocksToDos.get(2)); 
    
    // Calculate to-dos until case is solved:
    System.out.println(sherlocksToDos.indexOf("solve the case"));

    //number of index in arraylist
    System.out.println(sherlocksToDos.size());
      
    // Change the value printed:
    System.out.println("PRINT THE ANSWER HERE");

  }
  
}