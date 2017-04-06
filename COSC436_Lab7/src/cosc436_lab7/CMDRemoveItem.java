/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc436_lab7;

/**
 *
 * @author ringo
 */
public class CMDRemoveItem implements CommandInterface{
    private Aggregator agg;
    private String itemName;
    
    public CMDRemoveItem (Aggregator agg, String itemName){
        this.agg = agg;
        this.itemName = itemName;
    }

    public MenuItem execute(){
        Menu menu = agg.getMenu();
        return menu.remove(this.itemName);
    }
}
