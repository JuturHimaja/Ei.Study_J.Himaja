package adapter;

public class QuizAssessment implements IAssessment {
    private EssayAssessment essayAssessment;

    public QuizAssessment(EssayAssessment essayAssessment) {
        this.essayAssessment = essayAssessment;
    }

    @Override
    public void takeAssessment() {
        essayAssessment.writeEssay();
    }
}
