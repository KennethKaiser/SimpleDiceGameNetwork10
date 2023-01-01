package com.example.simpledicegamenetwork10;

public class Game {

    private RaffleCup raffleCup = new RaffleCup();
    private Conditions conditions = new Conditions();

    public Game(){}

    public Game(int nop){

        PlayerHandler playerHandler = new PlayerHandler(nop);
        Player currentPlayer;

        do {
            currentPlayer = playerHandler.currentPlayer();
            System.out.println("CurPlayer: " + currentPlayer.getNumber());
            turn(currentPlayer);


        }while(!conditions.checkWin(currentPlayer));


    }


    public void turn(Player currentPlayer){

        raffleCup.roll();
        System.out.println("Die: "+raffleCup.getOurRolls()[0] + " & Die: " + raffleCup.getOurRolls()[1]);

        int sixAmount = checkSix();
        System.out.println("Six: " + sixAmount);
        currentPlayer.setSixScore(currentPlayer.getSixScore() + sixAmount);
        System.out.println("Total: " + currentPlayer.getSixScore());

    }

    public int checkSix(){

        int sixAmount = 0;

        for(int i=0; i<raffleCup.getOurRolls().length; i++){
            if(raffleCup.getOurRolls()[i] == 6){
                sixAmount += 1;
            }
        }

        return sixAmount;

    }


}
