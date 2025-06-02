package com.madeline;

import com.birdbrain.Finch;

public class DancingFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();

        for (int i = 0; i < 4; i++) {
        bird.setMove("F", 30, 100);
        bird.setTurn("R", 90, 100);

        }


        bird.stop();
        bird.disconnect();
    }
    
}