package com.example.simpledicegamenetwork10;

public class PlayerHandler {

    private Player[] allPlayers;

    private int nID = -1;

    public PlayerHandler(int numberOfPlayers){
        allPlayers = new Player[numberOfPlayers];

        for(int i =0; i<numberOfPlayers; i++){
            allPlayers[i] = new Player(i);
        }
    }


    public Player currentPlayer(){
        nID++;

        if(nID>=allPlayers.length){
            nID = 0;
        }

        return allPlayers[nID];
    }


    public Player[] getAllPlayers() {
        return allPlayers;
    }

    public void setAllPlayers(Player[] allPlayers) {
        this.allPlayers = allPlayers;
    }

}
