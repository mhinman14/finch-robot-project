package com.madeline;

import com.birdbrain.Finch;

public class DancingFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();

        for (int i = 0; i < 4; i++) {
        bird.setMove("F", 30, 100);
        bird.setTurn("R", 90, 100);

        }

        bird.setTail("all", 0, 100, 0);
        bird.playNote(60,0.5);
        bird.setTurn("L",360,50);
        bird.setTurn("R", 180, 50);

        bird.setMove("B", 30, 100);
        bird.setTail(1,20,10,30);
        bird.setTurn("L", 45, 50);
        
      
      
        bird.stop();
        bird.disconnect();
    }
    
}