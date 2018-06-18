package pack1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw=resp.getWriter();
        pw.println("Hello World");


        Group lm02=new Group("lm02",1);

        Student[] st = new Student[10];

        try {
            st[0] = new Student( "Maria","Ponomarenko","1998-12-12","femail", "noGroup", 0);
            st[1] = new Student( "Vlad", "Dracula", "1212-12-12","mail", "noGroup", 0);
            st[2] = new Student( "Petya", "Petrov", "1999-10-10","mail", "noGroup", 0);
            st[3] = new Student( "Mahmud", "Mahmudov", "2001-12-12","mail", "noGroup", 0);
            st[4] = new Student( "Gulnara", "Karimova", "1999-10-10","femail", "noGroup", 0);
            st[5] = new Student( "Borya", "Vasiliev", "1991-10-10", "mail","noGroup", 0);
            st[6] = new Student( "Nicolay", "Petrenko", "2000-10-10", "mail","noGroup", 0);
            st[7] = new Student( "Bamba", "Balamba", "2000-12-12","mail", "noGroup", 0);
            st[8] = new Student( "Aleksandr", "Aleksandrov", "2000-12-12","mail", "noGroup", 0);
            st[9] = new Student( "Akim", "Caraedov", "2000-12-12","mail", "noGroup", 0);

        } catch (ParseException e) {
            System.out.println("Wrong birthday date format");
        }

        for(Student student: st){
            try {
                lm02.addStudent(student);
            } catch (GroupOverflowException e) {
                e.printStackTrace();
            }
        }
//        pw.println(lm02);
        req.setAttribute("group", lm02);
    }



}
