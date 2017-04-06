/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc436_lab7;
import java.util.ArrayList;
/**
 *
 * @author ringo
 */
public class CMDGetItems {
    Aggregator agg;
    
    public CMDGetItems(Aggregator agg){
        this.agg = agg;
    }
    
    public String[] execute(){
        String[] menu = new String[agg.getMenu().getMenuSize()];
        for(int i = 0; i < menu.length; i++){
            menu[i] = agg.getMenu().getMenuArrayList().get(i).toString();
        }
        return menu;
    }
}
