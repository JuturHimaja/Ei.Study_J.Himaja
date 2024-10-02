package strategy;

public class PercentageGrading implements GradingStrategy {
    @Override
    public String calculateGrade(int score) {
        return score + "%";
    }
}
