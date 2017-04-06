package cosc436_lab7;

import java.util.*;

public class UserInterface{
  public static void main (String[]args){
    int select;
    Scanner input = new Scanner(System.in);
    Invoker invoker = new Invoker(new Aggregator());
    SystemInterface.setInvoker(invoker);    
    System.out.print("MAIN MENU:\n1 - Add Item\n2 - Remove Item\n3 - Display Items\n4 - Display number of Vegetarian Items\n5 - quit\n");
    select = input.nextInt();
    while(select != 5){
        switch(select){
          case 1:
            System.out.println("Enter name:");
            String addName;
            addName = input.next();
            System.out.println("Is this vegetarian? (true/false)");
            boolean vegetarian;
            vegetarian = input.nextBoolean();
            System.out.println(addName + " " + vegetarian);
            SystemInterface.addItem(addName, vegetarian);
            break;
          case 2:
            System.out.println("Enter the name of the item to remove: ");
            String removeName = input.next();
            SystemInterface.removeItem(removeName);
            break;
          case 3:
            String[] menu = SystemInterface.getItems();
            //added this line for debugging purposes
            System.out.println(menu.length + " items are on the menu.");
            for(int i = 0; i < menu.length; i++){
                System.out.println(menu[i].toString());
            }
            break;
          case 4:
            System.out.println(SystemInterface.getNumVegetarian() + " vegetarian items on the menu.");
            break;
        }
        System.out.print("MAIN MENU:\n1 - Add Item\n2 - Remove Item\n3 - Display Items\n4 - Display number of Vegetarian Items\n5 - quit\n");
        select = input.nextInt();
    }
  }  
}