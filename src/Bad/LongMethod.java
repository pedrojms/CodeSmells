/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedrito
 */
public class LongMethod {
    
    
    public void printAmount() {
        List<Integer> l= new ArrayList<>();
        int amount = 200;
        for (Integer integer : l) {
            amount += integer;
        }
        printDetails(amount);
}

    private void printDetails(int amount) {
    }
    
}
