package this.methods;

public class Person{
    public int age;
    public int wisdom;
    public int fitness;
  
    public Person(int inputAge){
      this.age = inputAge;
      this.wisdom = inputAge * 5;
      this.fitness = 100 - inputAge;
    }
  
    public void setAge(int newAge){
      this.age = newAge;
    }
  
    public void setWisdom(int newWisdom){
      this.wisdom = newWisdom;
    }
  
    public void setFitness(int newFitness){
      this.fitness = newFitness;
    }
  
    public void hasBirthday(){
        //When called this method will modify each global (instance) variable
        //Complete this method
      this.age = this.age + 1;
      this.wisdom = this.wisdom + 5;
      this.fitness = this.fitness - 3;
    }
  
    public static void main(String[] args){
      Person emily = new Person(20);
      //hasBirthday is called on Emily and all values are modified
      emily.hasBirthday();
      System.out.println("New age is: " + emily.age);
      System.out.println("New wisdom is: " + emily.wisdom);
      System.out.println("New fitness is: " + emily.fitness);
    }
  }