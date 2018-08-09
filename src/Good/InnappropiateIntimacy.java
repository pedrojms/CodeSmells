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
public class InnappropiateIntimacy {
        public static class Account {
            private AccountType _type;
            private int _daysOverdrawn;
            
            double bankCharge() {
                double result = 4.5;
                if (get_daysOverdrawn() > 0) {
                    result += _type.overdraftCharge();
                }
                return result;
            }
            public AccountType get_type() {
                return _type;
            }
            public void set_type(AccountType _type) {
                this._type = _type;
            }
            public int get_daysOverdrawn() {
                return _daysOverdrawn;
            }
            public void set_daysOverdrawn(int _daysOverdrawn) {
                this._daysOverdrawn = _daysOverdrawn;
            }
        }
 
    public class AccountType {
        Account ac= new Account();
        double overdraftCharge() {
            if (ac.get_type().isPremium()) {
                double result = 10;
                if (ac.get_daysOverdrawn() > 7) {
                    result += (ac.get_daysOverdrawn() - 7) * 0.85;
                }
                return result;
            } else {
                return ac.get_daysOverdrawn() * 1.75;
            }
        }

        private boolean isPremium() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
}
