package lab1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Course> courses = new ArrayList<Course>();
        courses.add(new IntroJavaCourse("Introduction to Java","J100"));
        courses.add(new IntroToProgrammingCourse("Introduction to Prog with Go","P101"));
        courses.add(new AdvancedJavaCourse("Advanced Java with Algorithms","AJ200"));

        for(Course c: courses){
            System.out.println(c.getCourseNumber());
        }
    }
}
