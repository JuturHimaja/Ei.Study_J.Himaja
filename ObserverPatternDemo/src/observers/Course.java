package observers;

import utils.Logger;
import java.util.ArrayList;
import java.util.List;

public class Course implements ISubject {
    private List<IObserver> observers = new ArrayList<>();
    private String courseName;
    private String courseDetails;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDetails(String courseDetails) {
        this.courseDetails = courseDetails;
        notifyObservers(); // Notify observers when course details change
    }

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            String message = "Course: " + courseName + " has been updated. New details: " + courseDetails;
            observer.update(message);
            Logger.log(message);
        }
    }
}
