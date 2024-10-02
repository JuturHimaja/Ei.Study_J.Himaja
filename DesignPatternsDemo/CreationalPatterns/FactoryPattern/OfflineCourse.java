package factory;

public class OfflineCourse implements Course {
    @Override
    public void showDetails() {
        System.out.println("This is an Offline Course.");
    }
}
