package lab1;

public abstract class Course {
    String courseName;
    String courseNumber;
    double credits;

    public abstract String getCourseName();

    public abstract void setCourseName(String courseName);



    public abstract String getCourseNumber();

    public abstract void setCourseNumber(String courseNumber);

    public abstract double getCredits();

    public abstract void setCredits(double credits);
}
