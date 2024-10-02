import java.util.ArrayList;
import java.util.List;

// Observer interface
interface IObserver {
    void update(String message);
}

// Subject interface
interface ISubject {
    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyObservers();
}

// Concrete Subject
class Course implements ISubject {
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

    public String getCourseName() {
        return courseName;
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
            observer.update("Course: " + courseName + " has been updated. New details: " + courseDetails);
        }
    }
}

// Concrete Observer
class Student implements IObserver {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

// Main class to demonstrate the Observer Pattern
public class ObserverPatternExample {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics 101");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Students subscribe to the course updates
        mathCourse.attach(student1);
        mathCourse.attach(student2);

        // Update course details
        mathCourse.setCourseDetails("Course will start on March 10th, 2024.");

        // Update course details again
        mathCourse.setCourseDetails("Course syllabus has been updated. See the course portal for details.");
        
        // Unsubscribe a student
        mathCourse.detach(student1);
        
        // Final update after detaching
        mathCourse.setCourseDetails("Class timings have been changed to 10 AM.");
    }
}
