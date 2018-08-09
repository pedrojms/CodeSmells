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
public class InappropiateIntimacy {

    private static class AccountType {

        public AccountType() {
        }

        private boolean isPremium() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    public class Account {
        private AccountType _type;
        private int _daysOverdrawn;
        
        double overdraftCharge() {
            if (_type.isPremium()) {
                double result = 10;
                if (_daysOverdrawn > 7) {
                    result += (_daysOverdrawn - 7) * 0.85;
                }
                return result;
            } else {
                return _daysOverdrawn * 1.75;
            }
        }
        double bankCharge() {
            double result = 4.5;
            if (_daysOverdrawn > 0) {
                result += overdraftCharge();
            }
            return result;
        }
    }

}
