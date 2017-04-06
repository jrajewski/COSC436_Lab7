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
public class CMDGetNumVegetarian {
    Aggregator agg;
    int numV;
    
    public CMDGetNumVegetarian(Aggregator agg){
        this.agg = agg;
    }
    
    public Integer execute(){
        this.numV = 0;
        ArrayList<MenuItem> items = agg.getMenu().getMenuArrayList();
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).isVegetarian())
                this.numV++;
        }
        return numV;
    }
}
