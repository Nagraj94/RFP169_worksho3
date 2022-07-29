package com.bridgelabz;

import java.util.ArrayList;

public class DeckOfCards {
    ArrayList deck = new ArrayList();
    Object[][] players = new Object[4][9];
    /*
     * Function to distribute cards among 4 players.
     */
    public void initializeCards() {
        String[] shape = {"Spade","Diamond","Hearts","Clubs"};
        String[] rank = {"1","2","3","4","5","6","7","8","9","10","King","Queen","Jack"};
        for(int i=0;i<shape.length;i++) {
            for(int j=0; j<rank.length;j++) {
                String card= rank[j].concat(shape[i]);
                deck.add(card);
            }
        }
    }
    /*
     * Method to distribute cards among four players
     */
    public void distributeCards() {
        for(int i =0; i<4; i++) {
            for(int j=0; j<9; j++) {
                int random =(int) (Math.floor(Math.random() * 10) % deck.size() + 1);
                players[i][j]=deck.get(random);
                deck.remove(random);
            }
        }
    }
    /*
     * Method to display the cards obtained by four players
     */
    public void displayCards() {
        for(int i=0; i<4; i++) {
            System.out.print("Player "+(i+1)+" cards : ");
            System.out.println(" ");
            for(int j=0; j<9; j++) {
                System.out.println(players[i][j]+" ");
            }
            System.out.println();
        }
    }
}
