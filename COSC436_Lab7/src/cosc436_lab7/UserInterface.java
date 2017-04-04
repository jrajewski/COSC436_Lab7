import java.util.*;

public class UserInterface{
  public static void main (string[]args){
    int select;
    Scanner input = new Scanner(System.in);
    Invoker invoker = new Invoker(new aggregator());
    SystemInterface.setInvoker(invoker);    
    System.out.print("MAIN MENU:\n1 - Add Item\n2 - Remove Item\n3 - Display Items\n4 - Display number of Vegetarian Items");
    select = input.nextInt();
    switch(select){
      case 1:
        System.out.println("Enter name:");
        String name;
        name = input.next();
        System.out.println("Is this vegetarian?");
        boolean vegetarian;
        vegetarian = input.nextBoolean();
        SystemInterface.addItem(name, vegetarian);
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
    }
  
  
  }  
}