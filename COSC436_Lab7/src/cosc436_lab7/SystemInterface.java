public class SystemInterface{
  private static Invoker invoker;
  
  public static Invoker setInvoker(Invoker invoker){
  
  }
  
  public static String[] addItem(String name, boolean vegetarian){
    MenuItem item = invoker.addItem(new MenuItem(name, vegetarian));
    String[] itemArray = {item.toString()};
    return itemArray;
  }
  
  public static String[] removeItem(String name){
    MenuItem item = invoker.removeItem(name);
    String[] itemArray = {item.toString()};
    return itemArray;
  }
  
  public static String[] getItems(){
  
  }
  
  public static String[] getNumVegetarian(){
    
  }
}