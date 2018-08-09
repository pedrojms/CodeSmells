/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bad;

import java.io.IOException;

/**
 *
 * @author Pedrito
 */
public class DuplicateCode {
    public Position WalkNorth()
    {
        Player player = new Player();
        player.Move("N");
        return player.NewPosition;
    }
    public Position WalkSouth()
    {
        Player player = new Player();
        player.Move("S");
        return player.NewPosition;
    }
    public Position WalkEast()
    {
        Player player = new Player();
        player.Move("E");
        return player.NewPosition;
    }
    public Position WalkWest()
    {
        Player player = new Player();
        player.Move("W");
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