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
public class LargeClass {
    public class Person {
        private String _name;
        private TelephoneNumber _telephoneNumber = new TelephoneNumber();

        public String getTelephoneNumber() {
            return _telephoneNumber.getTelephoneNumber();
        }
 
  // GETTERS AND SETTERS
 
        public String getName() {
            return _name;
        }
    }
    
    public class TelephoneNumber {
        private String _officeAreaCode;
        private String _officeNumber;
        
        public String getTelephoneNumber() {
            return ("(" + get_officeAreaCode() + ") " + get_officeNumber());
        }
        // GETTERS AND SETTERS
        public String get_officeAreaCode() {
            return _officeAreaCode;
        }
        public void set_officeAreaCode(final String _officeAreaCode) {
            this._officeAreaCode = _officeAreaCode;
        }
        public String get_officeNumber() {
            return _officeNumber;
        }
        public void set_officeNumber(final String _officeNumber) {
            this._officeNumber = _officeNumber;
        }
    }

}
