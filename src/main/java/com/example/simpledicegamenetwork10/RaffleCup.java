package com.example.simpledicegamenetwork10;

import java.util.Random;

public class RaffleCup {


    private int []ourRolls; //The collected rolls
    private final int numberOfRolls = 2; //Number of times the die is being rolled
    private Die die = new Die();


    public void roll(){
        ourRolls = new int[numberOfRolls];
        Random random = new Random();

        for (int i = 0;i<numberOfRolls;i++){ //Runs loop a number of times equal to number of rolls.
            ourRolls[i] = random.nextInt((die.getMaximum()- die.getMinimum())+1)+1; //Rolls the die, and get a random number between min and max

        }
    }

    public int[] getOurRolls() {
        return ourRolls;
    }

    public void setOurRolls(int[] ourRolls) {
        this.ourRolls = ourRolls;
    }


}
