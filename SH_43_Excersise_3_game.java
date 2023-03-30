package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {
    private int random;
    private int userNum;
    private int numOfGuess = 0;
    private final Random rand = new Random();

    public Game() {
        random = rand.nextInt(100);
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 0 and 100:");
        userNum = sc.nextInt();
    }

    public boolean isCorrectNumber() {
        numOfGuess++;
        if (userNum == random) {
            System.out.println("You won the game in " + numOfGuess + " guesses.");
            return true;
        } else if (userNum < random && userNum <= 100) {
            System.out.println("Too low...");
        } else if (userNum > random && userNum <= 100) {
            System.out.println("Too high.");
        }
        System.out.println("Wrong number.");
        return false;
    }
}

public class SH_43_Excersise_3_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game1 = new Game();
        boolean b = false;
        while (!b) {
            game1.takeUserInput();
            b = game1.isCorrectNumber();
        }
    }
}
