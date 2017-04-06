package cosc436_lab7;
import java.util.ArrayList;
public class Menu{
  private ArrayList <MenuItem> menu;
  private int menuCount;
  public Menu(){
    menu = new ArrayList<MenuItem>(25);
    menuCount = menu.size();
  }
  
  public Integer nonVegetarian(){
    int count = 0;
    for(int i = 0; i < menu.size(); i++){
      if(menu.get(i).isVegetarian())
        count++;
    }
    return count;
  }
  
  public int getMenuSize(){
      return this.menuCount;
  }
  
  public ArrayList getMenuArrayList(){
      return this.menu;
  }
  
  public String[] getItems(){
    String[] items = new String[menu.size()];
    for(int i = 0; i < items.length; i++){
      items[i] = menu.get(i).toString();
    }
    return items;
  }
  
  //why not void
  public MenuItem add(MenuItem item){
    menu.add(item);
    return item;
  }
  
  //why not void
  public MenuItem remove(String item){
    for(int i = 0; i < menu.size(); i++){
      if(item.equals(menu.get(i).toString())){
        MenuItem copy = menu.get(i);
        menu.remove(i);
        return copy;
      }
    }
    return null;
  }
  
}