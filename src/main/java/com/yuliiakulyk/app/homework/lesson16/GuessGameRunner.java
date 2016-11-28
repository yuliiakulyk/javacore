package com.yuliiakulyk.app.homework.lesson16;

import com.yuliiakulyk.app.homework.lesson7.RandomArrayGenerators;

import java.util.ArrayList;
import java.util.Arrays;

import static com.yuliiakulyk.app.homework.lesson16.Celebrities.*;
import static com.yuliiakulyk.runners.utils.KeyboardInput.getKeyboardInput;
import static java.lang.Math.random;

/**
 * Created by Yuliia Kulyk on 28.11.2016.
 */
public class GuessGameRunner {
    RandomArrayGenerators generators = new RandomArrayGenerators();

    public static void main(String[] args) {
        ArrayList<Celebrities> fullCelebs = new ArrayList<>(Arrays.asList(Celebrities.values()));
        boolean doAgain = true;
        boolean newGame = true;
        Celebrities currentCelebrity;
        GuessGameRunner runner = new GuessGameRunner();
        ArrayList<Celebrities> remainingCelebs = new ArrayList<Celebrities>(fullCelebs);
        String userInput;
        int score = 0;
        int attempts = 0;
        do {
            if (newGame == true) {
                System.out.println("Welcome to the new Guess Game.\nEnter age of celebrities to continue the game.");
                System.out.println("Type \"exit\" to leave the game and get your score.");

            }
            newGame = false;
            currentCelebrity = runner.getNextCelebrity(remainingCelebs);
            System.out.println("Guess age of " + currentCelebrity.name);
            String ageString = Integer.toString(currentCelebrity.ageInFullYears);
            userInput = getKeyboardInput().toLowerCase();
            if (userInput.equals(ageString)) {
                System.out.println("You are right!");
                attempts++;
                score++;
            } else if (userInput.equals("exit")) {
                doAgain = false;
                System.out.println("Your score is " + score + " out of " + attempts + " attempts.");
            } else {
                System.out.println("Sorry, age of " + currentCelebrity.name + " is " + ageString + " years.");
                attempts++;
            }
            if (remainingCelebs.size() == 0) {
                remainingCelebs = new ArrayList<>(fullCelebs);
                System.out.println("You guessed age of all celebrities in our database.");
                System.out.println("Your score is " + score + " out of " + attempts + " attempts.");
                System.out.println("\n--------------------------------------------------\n");
                score = 0;
                attempts = 0;
                newGame = true;
            }
        } while (doAgain);
    }

    public Celebrities getNextCelebrity(ArrayList<Celebrities> remainingCelebs) {
        int number = generators.random1DimensionArray(1, 0, remainingCelebs.size() - 1)[0];
        Celebrities celebrity = remainingCelebs.get(number);
        remainingCelebs.remove(number);
        return celebrity;
    }
}
