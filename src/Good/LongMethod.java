/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Good;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedrito
 */
public class LongMethod {
    List<Integer> l= new ArrayList<>();
    
    
    public void printAmount() {
        int amount = 200;
        amount = getAmount(amount);
        printDetails(amount);
    }
    private int getAmount(int amount) {
        for (Integer integer : l) {
            amount += integer;
        }
        return amount;
}

    private void printDetails(int amount) {
    }
    
    
    
}
