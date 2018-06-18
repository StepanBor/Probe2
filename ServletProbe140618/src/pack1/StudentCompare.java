package pack1;

import java.util.Comparator;

public class StudentCompare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        if(o1==null & o2!=null){
            return -1;
        }

        if (o1!=null & o2==null){
            return 1;
        } else if (o1==null & o2==null){
            return  0;
        }


        if (o1.getLastmame().compareToIgnoreCase(o2.getLastmame())==0){
            return (o1.getName().compareToIgnoreCase(o2.getName()));
        }

        return o1.getLastmame().compareToIgnoreCase(o2.getLastmame());
    }
}
