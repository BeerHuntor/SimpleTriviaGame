package net.HuntorGames;

import java.util.Scanner;

public class TriviaGame {
    static GameManager _gm = new GameManager();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        GameInProgress();

    }

    public static void GameInProgress(){
        System.out.println("Welcome to F1 Trivia, can you answer all the questions correctly? ");
        System.out.println ("What is your Name?");
        _gm.SetPlayerName(scanner.nextLine());
        System.out.println("Lets get started " + _gm.GetPlayerName());
        while(_gm.GetCurrentQuizQuestionNumber() < 4)
        {
            GetNextQuestion();
            CheckingAnswer(scanner.nextLine());
        }
        System.out.println("You have completed the quiz with a score of: " + _gm.GetCurrentScore() + " correct questions.");
    }

    public static void GetNextQuestion() {
        System.out.println(_gm.GetCurrentQuestion());

    }
    public static void CheckingAnswer(String answer) {
        if (_gm.CheckIfCorrectAnswer(answer)){
            System.out.println("Correct.");
            _gm.SetCurrentScore(1);

        } else {
            System.out.println("Sorry that is incorrect. The correct answer was " + _gm.GetCorrectAnswer());
        }
        _gm.SetCurrentQuizQuestion();
    }


}
