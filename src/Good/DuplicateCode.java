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
public class DuplicateCode {
    public Position Walk(String direction)
    {
        Player player = new Player();
        player.Move(direction);
        return player.NewPosition;
    } 
    
    private static class Position {

        public Position(String s) {
        }
    }

    private static class Player {

        private Position NewPosition;

        public Player() {
        }
        private void Move(String s) {
            this.NewPosition= new Position(s);
        }
    }
    
    
}
