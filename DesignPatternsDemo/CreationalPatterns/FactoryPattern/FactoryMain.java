package main;

import factory.Course;
import factory.CourseFactory;

public class FactoryMain {
    public static void main(String[] args) {
        Course onlineCourse = CourseFactory.getCourse("online");
        onlineCourse.showDetails();

        Course offlineCourse = CourseFactory.getCourse("offline");
        offlineCourse.showDetails();
    }
}
