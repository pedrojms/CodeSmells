/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Good;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pedrito
 */
//Refactoring: Replace conditionals with polymorphism.
public class SwitchStatements {
    class DiscountFactory {
        private final Map<String, DiscountStrategy> strategies = new HashMap<>();
        private final DiscountStrategy DEFAULT_STRATEGY = () -> 0;
        
        DiscountFactory(){
            strategies.put("code1", () -> 10);
            strategies.put("code2", () -> 20);
        }
        
        public DiscountStrategy getDiscountStrategy(String priceCode) {
            if (!strategies.containsKey(priceCode)) {
                return DEFAULT_STRATEGY;
            }
            return strategies.get(priceCode);
        }
    }
    
    class Product {
        private DiscountStrategy discountStrategy;
        
        Product(DiscountStrategy discountStrategy) {
            this.discountStrategy = discountStrategy;
        }
        
        public int getDiscount() {
            return discountStrategy.getDiscount();
        }
    }
    
    interface DiscountStrategy {
        int getDiscount();
    }
    
}
