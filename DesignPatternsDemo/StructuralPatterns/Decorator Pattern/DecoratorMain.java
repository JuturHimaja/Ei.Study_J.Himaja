package main;

import decorator.BasicCourse;
import decorator.CertificationDecorator;
import decorator.Course;

public class DecoratorMain {
    public static void main(String[] args) {
        Course basicCourse = new BasicCourse();
        System.out.println(basicCourse.getDescription() + ": $" + basicCourse.getCost());

        // Add certification
        Course
