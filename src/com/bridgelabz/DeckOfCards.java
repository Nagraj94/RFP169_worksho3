package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DeckOfCards {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> deck = new ArrayList<>();
    ArrayList<Players> nameList = new ArrayList<>();

    public void initializeCards() {
        String[] shape = {"Spade", "Diamond", "Hearts", "Clubs"};
        String[] rank = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "King", "Queen", "Jack"};
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                String card = rank[j].concat(shape[i]);
                deck.add(card);
            }
        }
    }

    public boolean addPlayer() {
        System.out.print("Enter number of players to play: ");
        int num = sc.nextInt();
        if (num <= 4) {
            for (int i = 1; i <= num; i++) {
                System.out.print("Enter player " + i + " name: ");
                String name = sc.next();
                Players playerName = new Players(name);
                nameList.add(playerName);
            }
        } else {
            System.out.println("only below 4 players can play");
            return addPlayer();
        }
        return sequenceOfPlayer();
    }

    public boolean sequenceOfPlayer() {
        System.out.println();
        System.out.println("player allocation ");
        System.out.println();
        Collections.shuffle(nameList);
        int i = 1;
        for (Players name:nameList) {
            System.out.println(name.playerName);
            if (i==1){
                System.out.println("will play and receive cards "+i+"st");
            }
            if (i==2){
                System.out.println("will play and receive cards "+i+"nd ");
            }
            if (i==3){
                System.out.println("will play and receive cards "+i+"rd");
            }
            if (i==4){
                System.out.println("will play and receive cards "+i+"th");
            }
            i++;
        }
        return false;
    }

    public void shuffleCards(){
        Collections.shuffle(deck);
        System.out.println("Cards is shuffled ");
        System.out.println(" ");
    }
    public void distributeCards(){
        for (Players name: nameList) {
            System.out.println("");
            System.out.println(name);
            for (int i=0;i<9;i++){
                int random = (int)(Math.floor(Math.random())*10)%deck.size()+1;
                System.out.print(deck.get(random)+", ");
                deck.remove(random);
            }
        }
    }
    public void displayCards() {
        System.out.println(deck);
    }

}