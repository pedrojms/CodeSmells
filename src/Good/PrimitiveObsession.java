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
public class PrimitiveObsession {
    class User{
               
        Relationship relationship;
        
        public void setRelationship(Relationship relationship){
            this.relationship=relationship;
        }
        
        public Relationship getRelationship(){
            return this.relationship;
        }
        
        
    }
    
    class Relationship{
        String relationshipCode;

        public Relationship(String relationshipCode) {
            this.relationshipCode = relationshipCode;
        }

        public String getRelationshipCode() {
            return this.relationshipCode;
        }
        
        public Relationship single(){
            return new Relationship("S");
        }
        
        public Relationship inRelationship(){
            return new Relationship("R");
        }
        
        
    }
    
}
