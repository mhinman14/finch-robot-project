package com.madeline;

import com.birdbrain.Finch;

public class DancingFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();

        for (int i = 0; i < 4; i++) {
        bird.setMove("F", 30, 100); //moves finch in square motion
        bird.setTurn("R", 90, 100);

        }

        bird.setTail("all", 0, 100, 0); //lights, sound and begins dance
        bird.playNote(60,0.5);
        bird.setTurn("L",360,50);
        bird.setTurn("R", 180, 50);

        bird.setMove("B", 30, 100); //moves backwards and changes color 
        bird.setTail(1,20,10,30);
        bird.setTurn("L", 45, 50);
       
       for (int i = 0; i < 3; i++){
        bird.playNote(35, 2);
        bird.playNote(65, 2);
        bird.playNote(100, 2);
        bird.setTurn("R", 45, 100);
        bird.setTurn("L", 30, 100);
       }
      
      
        bird.stop(); //stops program and disconnects
        bird.disconnect();
    }
    
}