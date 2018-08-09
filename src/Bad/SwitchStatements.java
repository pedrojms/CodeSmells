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
public class SwitchStatements {
    class Product {
    String priceCode;
    int discount;

    Product(String priceCode) {
        setDiscount(priceCode);
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(String priceCode) {
        switch (priceCode) {
            case "CODE1":
                discount = 20; // some logic;
            case "CODE2":
                discount = 30;// some other logic;
            case "CODE3":
                discount = 40;// some other logic;
        }
    }
}
    
}
