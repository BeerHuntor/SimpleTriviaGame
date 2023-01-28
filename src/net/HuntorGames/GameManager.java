package net.HuntorGames;


public class GameManager {
    private int currentQuestionNumber = 1;
    private int currentQuizScore = 0;

    private String currentQuestion;
    private String correctAnswer;
    private String playerName = "";

    void QuestionIndex()
    {

        switch(currentQuestionNumber)
        {
            case 1:
                currentQuestion = "What year did Max Verstappen enter his first full season in Formula 1?";
                correctAnswer = "2015";
                break;
            case 2:
                currentQuestion = "Who was the first team Lewis Hamilton drove for?";
                correctAnswer = "McLaren";
                break;
            case 3:
                currentQuestion = "What year did Fernando Alonso win his first World Drivers Championship?";
                correctAnswer = "2005";
                break;
        }

    }

    public String GetCurrentQuestion()
    {
        QuestionIndex();
        return currentQuestion;
    }

    public boolean CheckIfCorrectAnswer(String answer)
    {
        return answer.equalsIgnoreCase(correctAnswer);
    }
    public int GetCurrentQuizQuestionNumber()
    {
        return currentQuestionNumber;
    }
    public void SetCurrentQuizQuestion()
    {
        currentQuestionNumber ++;
    }
    public String GetCorrectAnswer() {
        return correctAnswer;
    }

    public void SetPlayerName(String pName){
        playerName = pName;
    }
    public String GetPlayerName()
    {
        return playerName;
    }
    public int GetCurrentScore(){
        return currentQuizScore;
    }
    public void SetCurrentScore(int scoreToAdd) {
        currentQuizScore += scoreToAdd;
    }

}
