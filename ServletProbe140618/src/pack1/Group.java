package pack1;

import java.util.ArrayList;
import java.util.List;


public class Group {

    private String groupeName;
    private int course;
    private List<Student> studentList;

    public Group(String groupeName, int course) {
        this.groupeName = groupeName;
        this.course = course;
        studentList=new ArrayList<Student>();
    }

    public Group() {
    }

    public String getGroupeName() {
        return groupeName;
    }

    public void setGroupeName(String groupeName) {
        this.groupeName = groupeName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        studentList.sort(new StudentCompare());
        return "Group{" +
                "groupeName='" + groupeName + '\'' +
                ", course=" + course +
                ", studentList=" +System.lineSeparator()+ studentList +
                '}';
    }

    public void addStudent(Student st1) throws GroupOverflowException {

        if (studentList.size()>=10){
            throw new GroupOverflowException();
        }
        if(studentList.contains(st1)){

            return;
        }
        studentList.add(st1);
        st1.setGroupName(groupeName);
        st1.setCourse(course);
    }

    public void excludeStudent (Student st1){
        studentList.remove(st1);
        st1.setCourse(0);
        st1.setGroupName("noGroup");
    }
    public void excludeStudent (String lastname){
        for (Student st:studentList) {
            if(st.getLastmame().equals(lastname)){
                excludeStudent(st);
            }
        }
    }
}
