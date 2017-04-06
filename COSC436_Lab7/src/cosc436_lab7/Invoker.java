package cosc436_lab7;

public class Invoker{
  private Aggregator aggregator;
  
  public Invoker(Aggregator aggregator){
    this.aggregator = aggregator;
  }
  
  public MenuItem addItem(MenuItem item){
      //how do you reference the CMDAddItem obejct?
    CMDAddItem addItem = new CMDAddItem(aggregator, item);
    addItem.execute();
    return item;
  }
  
  public String removeItem(String name){
    CMDRemoveItem removeItem = new CMDRemoveItem(aggregator, name);
    removeItem.execute();
    return name;
  }
  
  public String[] getMenu(){
    CMDGetItems getItems = new CMDGetItems(aggregator);
    return getItems.execute();
  }
  
  public Integer getNumVegetarian(){
      CMDGetNumVegetarian numVegetarian = new CMDGetNumVegetarian(aggregator);
      return numVegetarian.execute();
  }
  
  
}