public class MenuItem{
  private String description;
  private boolean vegetarian;
  
  public MenuItem(String name, boolean veg){
    description = name;
    vegetarian = veg;
  }
  
  public String toString(){
    return this.name;
  }
  
  public boolean isVegetarian(){
    return this.vegetarian;
  }
  
}