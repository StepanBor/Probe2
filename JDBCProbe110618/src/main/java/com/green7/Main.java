package com.green7;
import java.sql.*;
public class Main {

    public static void main(String[] args) {

        try(Connection conect1= DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root","1979");
            Statement st1=conect1.createStatement()){

            st1.execute("CREATE TABLE if not exists persons (id Serial, PersName VARCHAR (100), Lastname VARCHAR (100), sex Enum ('Mail','Femail'), PRIMARY KEY (id))");


        }catch (SQLException e){
            System.out.println(e);
        }

        
    }
}
