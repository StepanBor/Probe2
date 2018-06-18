package pack1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class Student extends Human {

    private String groupName;
    private int course;


    public Student(String name, String lastmame, String birthDay, String sex, String groupName, int course) throws ParseException {
        super(name, lastmame, birthDay, sex);
        this.groupName = groupName;
        this.course = course;
    }

    public Student(String groupName, int course) {
        this.groupName = groupName;
        this.course = course;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(groupName, student.groupName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), groupName, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupName='" + groupName + '\'' +
                ", course=" + course +
                "} " + super.toString()+System.lineSeparator();
    }
}
