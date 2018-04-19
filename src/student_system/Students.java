package student_system;

import JDBCUtils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Students {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    Scanner scanner = new Scanner(System.in);
    public Students(){
        try {
            connection = JDBCUtils.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void lookOver(){}
    public void search(){}
    public void add(){}
    public void update(){}
    public void delete(){}
}
