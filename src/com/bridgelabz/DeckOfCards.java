package com.bridgelabz;

import java.util.ArrayList;

public class DeckOfCards {
    ArrayList deck = new ArrayList();

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
    public void displayCards(){
        System.out.println(deck);
    }


}
