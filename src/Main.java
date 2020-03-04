

import model.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Rock, Paper, Scissors.");
        System.out.println("Enter 1 for Rock, 2 for Paper and 3 for scissors");

        Scanner scanner = new Scanner(System.in);
        int takeInput = scanner.nextInt();
        //        System.out.println(takeInput);
        Game newGame = new Game(takeInput);

        int newShape = newGame.getShape();

        newGame.play(newShape);
        /*
            When you want to implement repetition;
        */
//        newGame.play(newShape);

    }
}
