package cosc436_lab7;

public class SystemInterface{
  private static Invoker invoker;
  
  public static Invoker setInvoker(Invoker invoker){
      SystemInterface.invoker = invoker;
      return invoker;
  }
  
  public static String[] addItem(String name, boolean vegetarian){
    MenuItem item = invoker.addItem(new MenuItem(name, vegetarian));
    //this prints out null
    //it should print the name of the item
    System.out.println(item.toString());
    String[] itemArray = {item.toString()};
    return itemArray;
  }
  
  public static String[] removeItem(String name){
    invoker.removeItem(name);
    String[] itemArray = {name};
    return itemArray;
  }
  
  public static String[] getItems(){
      return invoker.getMenu(); 
  }
  
  public static String[] getNumVegetarian(){
      //console output shows incorrect characters insted of the number of vegetarian items
      String[] numVegetarian = {invoker.getNumVegetarian().toString()};
      return numVegetarian;
  }
}