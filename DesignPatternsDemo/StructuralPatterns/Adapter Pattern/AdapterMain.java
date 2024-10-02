package main;

import adapter.EssayAssessment;
import adapter.IAssessment;
import adapter.QuizAssessment;

public class AdapterMain {
    public static void main(String[] args) {
        EssayAssessment essay = new EssayAssessment();
        IAssessment quizAdapter = new QuizAssessment(essay);

        quizAdapter.takeAssessment(); // Taking Essay as a Quiz
    }
}
