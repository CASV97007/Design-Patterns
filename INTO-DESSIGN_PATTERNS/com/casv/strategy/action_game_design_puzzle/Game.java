package com.casv.strategy.action_game_design_puzzle;

import com.casv.strategy.action_game_design_puzzle.model.King;
import com.casv.strategy.action_game_design_puzzle.model.Queen;
import com.casv.strategy.action_game_design_puzzle.model.Character;
public class Game {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        Character queen = new Queen();
        queen.fight();

    }
}
