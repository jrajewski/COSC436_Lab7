package cosc436_lab7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ringo
 */
public class CMDAddItem implements CommandInterface{
    private Aggregator agg;
    private MenuItem item;
    
    public CMDAddItem(Aggregator agg, MenuItem item){
        this.agg = agg;
        this.item = item;
    }
    
    public MenuItem execute(){
        agg.getMenu().add(item);
        return item;
    }
}
