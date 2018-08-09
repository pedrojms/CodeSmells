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

//Refactoring: Replace Type Code with Class
public class PrimitiveObsession {
    class User{
        
        String SINGLE= "S";
        String IN_RELATIONSHIP= "R";
        
        String relationship;
        
        public void setRelationship(String relationship){
            this.relationship=relationship;
        }
        
        public String getRelationship(){
            return this.relationship;
        }
        
        
    }
    
}
