package decorator;

public class CertificationDecorator extends CourseDecorator {
    public CertificationDecorator(Course course) {
        super(course);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Certification";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.00;
    }
}
