package pack1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Human {


    private String name;
    private String lastmame;
    private Date birthDay;
    private String sex;
    private int age;
    private Calendar today;
    private Calendar birthdayCal;

    public Human(String name, String lastmame, String birthDay, String sex) throws ParseException {

        today = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        birthdayCal = Calendar.getInstance();
        this.name = name;
        this.lastmame = lastmame;
        this.birthDay = sdf.parse(birthDay);
        this.sex = sex;
        birthdayCal.setTime(this.birthDay);
    }

    public Human() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastmame() {
        return lastmame;
    }

    public void setLastmame(String lastmame) {
        this.lastmame = lastmame;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return today.get(Calendar.YEAR)-birthdayCal.get(Calendar.YEAR);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(lastmame, human.lastmame) &&
                Objects.equals(birthDay, human.birthDay) &&
                Objects.equals(sex, human.sex);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, lastmame, birthDay, sex);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastmame='" + lastmame + '\'' +
                ", birthDay=" + birthDay +
                ", sex='" + sex + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
