package main;

import strategy.GradingStrategy;
import strategy.LetterGrading;
import strategy.PercentageGrading;

public class StrategyMain {
    public static void main(String[] args) {
        GradingContext context = new GradingContext();

        // Use Letter Grading
        context.setGradingStrategy(new LetterGrading());
        System.out.println("Letter Grade: " + context.calculateGrade(85));

        // Switch to Percentage Grading
        context.setGradingStrategy(new PercentageGrading());
        System.out.println("Percentage Grade: " + context.calculateGrade(85));
    }
}

class GradingContext {
    private GradingStrategy strategy;

    public void setGradingStrategy(GradingStrategy strategy) {
        this.strategy = strategy;
    }

    public String calculateGrade(int score) {
        return strategy.calculateGrade(score);
    }
}
