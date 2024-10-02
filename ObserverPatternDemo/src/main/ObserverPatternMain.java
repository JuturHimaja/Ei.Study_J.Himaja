package main;

import observers.Course;
import observers.Student;

public class ObserverPatternMain {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics 101");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Students subscribe to the course updates
        mathCourse.attach(student1);
        mathCourse.attach(student2);

        // Update course details
        mathCourse.setCourseDetails("Course will start on March 10th, 2024.");
        mathCourse.setCourseDetails("Course syllabus has been updated. See the course portal for details.");
        
        // Unsubscribe a student
        mathCourse.detach(student1);
        
        // Final update after detaching
        mathCourse.setCourseDetails("Class timings have been changed to 10 AM.");
    }
}

