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
//Refactoring: Extract Method
public class FeatureEnvy {
   public class Phone {
       private final String unformattedNumber;
       public Phone(String unformattedNumber) {
           this.unformattedNumber = unformattedNumber;
       }
       private String getAreaCode() {
           return unformattedNumber.substring(0,3);
       }
       private String getPrefix() {
           return unformattedNumber.substring(3,6);
       }
       private String getNumber() {
           return unformattedNumber.substring(6,10);
       }
       public String toFormattedString() {
           return "(" + getAreaCode() + ") " + getPrefix() + "-" + getNumber();
       }  
   }
   public class Customer{
       private Phone mobilePhone;
       public String getMobilePhoneNumber() {
           return mobilePhone.toFormattedString();
       }
   }
    
}
