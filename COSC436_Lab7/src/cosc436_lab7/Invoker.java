
import cosc436_lab7.CMDAddItem;

public class Invoker{
  private Aggregator aggregator;
  
  public Invoker(Aggregator aggregator){
    this.aggregator = aggregator;
  }
  
  public MenuItem addItem(MenuItem item){
      //how do you reference the CMDAddItem obejct?
    CMDAddItem addItem = new CMDAddItem(aggregator, item);
    return item;
  }
  
  public MenuItem removeItem(String name){
    
  }
  
}