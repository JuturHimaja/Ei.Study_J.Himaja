package factory;

public class OnlineCourse implements Course {
    @Override
    public void showDetails() {
        System.out.println("This is an Online Course.");
    }
}
