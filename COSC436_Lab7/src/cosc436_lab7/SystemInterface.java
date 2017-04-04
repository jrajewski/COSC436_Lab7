public class SystemInterface{
  private static Invoker invoker;
  
  public static Invoker setInvoker(Invoker invoker){
  
  }
  
  public static String[] addItem(String name, boolean vegetarian){
    MenuItem item = invoker.addItem(new MenuItem(itemName, vegetarian));
    return item.toString();
  }
  
  public static String[] removeItem(String name){
    MenuItem item = invoker.removeItem(name);
  }
  
  public static String[] getItems(){
  
  }
  
  public static String[] getNumVegetarian(){
    
  }
}