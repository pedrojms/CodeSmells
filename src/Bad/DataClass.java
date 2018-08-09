/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bad;

/**
 *
 * @author Pedrito
 */
public class DataClass {
    public class Test {
        public int low, high;
        
        boolean includes(final int arg) {
            return arg >= low && arg <= high;
        }
    }
    
}
