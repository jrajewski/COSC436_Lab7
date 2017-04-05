public class Menu{
  private ArrayList <MenuItem> menu;
  public Menu(){
    menu = new ArrayList<MenuItem>(25);
  }
  
  public Integer nonVegetarian(){
    int count = 0;
    for(int i = 0; i < menu.size; i++){
      if(menu[i].isVegetarian())
        count++;
    }
    return count;
  }
  
  public String[] getItems(){
    String[] items = new String[menu.size];
    for(int i = 0; i < items.length; i++){
      items[i] = menu[i];
    }
  }
  
  //why not void
  public MenuItem add(MenuItem item){
    menu.add(item);
    return item;
  }
  
  //why not void
  public MenuItem remove(MenuItem item){
    for(int i = 0; i < menu.size; i++){
      if(item.toString().equals(menu[i].toString())){
        menu.remove(i);
        return item;
      }
    }
    return null;
  }
  
}