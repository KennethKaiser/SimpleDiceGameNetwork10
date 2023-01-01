package com.example.simpledicegamenetwork10;

public class Player {

    private int number;
    private int sixScore;



    public Player(int playerNumber){

        number = playerNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSixScore() {
        return sixScore;
    }

    public void setSixScore(int sixScore) {
        this.sixScore = sixScore;
    }

}
