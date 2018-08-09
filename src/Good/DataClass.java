/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Good;

/**
 *
 * @author Pedrito
 */
//Refactoring: Encapsulate Field
public class DataClass {
    public class Test {
        private int low, high;
        boolean includes(final int arg) {
            return arg >= getLow() && arg <= getHigh();
        }
        public int getLow() {
            return low;
        }
        public int getHigh() {
            return high;
        }

        public void setLow(int low) {
            this.low = low;
        }

        public void setHigh(int high) {
            this.high = high;
        }
        
        
    }
}
