package cosc436_lab7;



public class MenuItem{
  private String description;
  private boolean vegetarian;
  private String name;
  
  public MenuItem(String name, boolean veg){
    this.description = name;
    this.vegetarian = veg;
  }
  
  public String toString(){
    return this.name;
  }
  
  public boolean isVegetarian(){
    return this.vegetarian;
  }
  
}