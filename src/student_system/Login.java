package student_system;

import JDBCUtils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class Login {
    SystemMain systemMain = new SystemMain();
    Scanner scanner = new Scanner(System.in);
    public void signInStudent(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            int i=1;
            while (i<5){
                System.out.println("新用户名：");
                String name = scanner.nextLine();
                System.out.println("新密码：");
                String key = scanner.nextLine();
                String sql = "INSERT INTO studentkey (users,passwords) VALUES (?,?)";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,name);
                preparedStatement.setString(2,key);
                preparedStatement.executeQuery();
                if (resultSet.next()){
                    System.out.println("注册成功");
                    break;
                }else {
                    System.out.println("注册失败，重新注册");
                }
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void logInStudents() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            int i = 1;
            while (i<5){
                System.out.println("用户名：");
                String name = scanner.nextLine();
                System.out.println("密码：");
                String key = scanner.nextLine();
                String sql = "SELECT * FROM studentkey WHERE users = ? AND passwords = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,name);
                preparedStatement.setString(2,key);
                preparedStatement.executeQuery();
                if (resultSet.next()){
                    System.out.println("登录成功");
                    break;
                }else {
                    System.out.println("第"+i+"次登录失败，重新登录");
                }
                i++;
            }
            systemMain.menu3();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void logInAdministrator(){
        while (true) {
            System.out.println("请输入管理员账户：");
            String name = scanner.nextLine();
            String trueNames = "Administrator";
            System.out.println("请输入管理员密码：");
            String key = scanner.nextLine();
            String trueKey = "Administrator";
            if (name.equals(trueNames) && key.equals(trueKey)) {
                systemMain.menu2();
            } else {
                System.out.println("账号和密码错误，请从新输入。");
            }
        }
    }
    public void selects(){
        System.out.println("您是否注册了学生账号？ 是/否");
        while (true) {
            String string = scanner.next();
            if (string.equals("是")) {
                logInStudents();
            }else if (string.equals("否")){
                signInStudent();
            }else {
                System.out.println("输入错误，从新输入。");
            }
        }
    }
    public void selectFrom(){
        while (true){
            System.out.println("1.管理员登录");
            System.out.println("2.学生登录");
            System.out.println("请输入您的选择：");
            int a = scanner.nextInt();
            switch (a){
                case 1:logInAdministrator();
                break;
                case 2:selects();
                break;
                default:
                    System.out.println("没有这个选项，请重新输入。");
                    break;
            }
        }
    }
}
