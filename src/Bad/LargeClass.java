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
public class LargeClass {
    public class Person {
        private String _name;
        private String _officeAreaCode;
        private String _officeNumber;
        
        public String getTelephoneNumber() {
            return ("(" + _officeAreaCode + ") " + _officeNumber);
        }
 
  // GETTERS AND SETTERS
        public String getName() {
            return _name;
        }
        public String getOfficeAreaCode() {
            return _officeAreaCode;
        }
        public void setOfficeAreaCode(final String arg) {
            _officeAreaCode = arg;
        }
        public String getOfficeNumber() {
            return _officeNumber;
        }
        public void setOfficeNumber(final String arg) {
            _officeNumber = arg;
        }
    }
    
}
