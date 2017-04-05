import java.util.*;

public class UserInterface{
  public static void main (String[]args){
    int select;
    Scanner input = new Scanner(System.in);
    Invoker invoker = new Invoker(new Aggregator());
    SystemInterface.setInvoker(invoker);    
    System.out.print("MAIN MENU:\n1 - Add Item\n2 - Remove Item\n3 - Display Items\n4 - Display number of Vegetarian Items");
    select = input.nextInt();
    switch(select){
      case 1:
        System.out.println("Enter name:");
        String addName;
        addName = input.next();
        System.out.println("Is this vegetarian? (true/false)");
        boolean vegetarian;
        vegetarian = input.nextBoolean();
        SystemInterface.addItem(addName, vegetarian);
        break;
      case 2:
        System.out.println("Enter the name of the item to remove: ");
        String removeName = input.next();
        SystemInterface.removeItem(removeName);
        break;
      case 3:
          SystemInterface.getItems();
        break;
      case 4:
        SystemInterface.getNumVegetarian();
        break;
    }
  
  
  }  
}