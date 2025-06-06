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
       
        
        bird.playNote(64, 0.5); //plays first few notes of Mary Had A Little Lamb
        bird.pause(0.5);
        bird.playNote(62, 0.5);
        bird.pause(0.5);
        bird.playNote(60, 0.5);
        bird.pause(0.5);
        bird.playNote(64, 0.5);
        bird.pause(1);
        bird.playNote(64, 0.5);
        bird.pause(1);
        bird.playNote(64, 0.5);
        bird.pause(1);

        


       for (int i = 0; i < 3; i++){ //moves bird right and left three times from for loop
        bird.setTurn("R", 45, 100);
        bird.setTurn("L", 30, 100);
       }

        bird.setTail(1, 100, 50, 0);
        bird.setTail(2, 50, 100, 50);
        bird.setTail(3, 0, 50, 100);
        bird.setTail(4, 50, 50, 50);

      
        bird.stop(); //stops program and disconnects
        bird.disconnect();
    }
    
}