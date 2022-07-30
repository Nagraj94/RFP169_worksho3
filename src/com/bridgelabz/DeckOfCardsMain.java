package com.bridgelabz;

import java.util.Scanner;

public class DeckOfCardsMain {
 static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards();
        while (true){
            System.out.println("");
            System.out.println("1.Add players\n2.Shuffle cards\n3.Distribute cards");
            int check = sc.nextInt();
            if (check == 1){
                cards.initializeCards();
                cards.addPlayer();
            } else if (check == 2) {
                cards.shuffleCards();
            } else if (check == 3) {
                cards.distributeCards();
            }
        }

    }

}
