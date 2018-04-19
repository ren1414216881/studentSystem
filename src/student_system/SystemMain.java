package student_system;

import java.util.Scanner;

public class SystemMain {
    Scanner scanner = new Scanner(System.in);
    Login login = new Login();
    private Students students = new Students();
    public void menu1(){
        boolean j = true;
        while (j){
            list1();
            System.out.println("请输入您的选择：");
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    login.selectFrom();
                    break;
                case 2:
                    System.out.println("您已退出系统。");
                    j = false;
                    break;
                    default:
                        System.out.println("没有这个选项，请重新输入。");
                        break;
            }
        }
    }
    public void menu2(){
        boolean j = true;
        while (j){
            list2();
            System.out.println("请输入您的选择：");
            int i = scanner.nextInt();
            switch (i){
                case 1:students.lookOver();
                break;
                case 2:students.search();
                break;
                case 3:students.add();
                break;
                case 4:students.update();
                break;
                case 5:students.delete();
                break;
                case 6:menu1();
                break;
                case 7:
                    System.out.println("您已经退出系统");
                    j = false;
                    break;
                default:
                    System.out.println("没有这个选项，请重新输入。");
                    break;
            }
        }
    }
    public void menu3(){
        boolean j = true;
        while (j){
            list3();
            System.out.println("请输入您的选择：");
            int i = scanner.nextInt();
            switch (i){
                case 1:students.lookOver();
                    break;
                case 2:students.search();
                    break;
                case 3:menu1();
                    break;
                case 4:
                    System.out.println("您已经退出系统");
                    j = false;
                    break;
                default:
                    System.out.println("没有这个选项，请重新输入。");
                    break;
            }
        }
    }
    public void list1(){
        String str = "毕业生就业协议书是由国家教育部统一印发的、\n用于确定就业双方权利、义务的法律文书，是毕\n业生与用人单位之间签定就业关系的凭证，同时\n也是学校编制就业方案，进行毕业生派遣的依\n据。为进一步规范协议书的使用与管理，结合我\n校实际，特制定本规定。";
        System.out.println("          ……学生管理系统……           ");
        System.out.println("---------------------------------------");
        System.out.println("公告：\n"+str);
        System.out.println("1.开始使用                      2.退出");
        System.out.println("---------------------------------------");
        System.out.println("uplooking.com\n\n");
    }
    public void list2(){
        System.out.println("--------学生信息管理系统(管理员)---------");
        System.out.println("1.查看全部学生信息");
        System.out.println("2.查询单个学生信息");
        System.out.println("3.添加学生个人信息");
        System.out.println("4.修改学生个人信息");
        System.out.println("5.删除学生个人信息");
        System.out.println("6.返回");
        System.out.println("7.直接退出系统");
        System.out.println("---------------------------------------");
        System.out.println("uplooking.com\n\n");
    }
    public void list3(){
        System.out.println("---------学生信息查看系统(学生)----------");
        System.out.println("1.查看全部学生信息");
        System.out.println("2.查询单个学生信息");
        System.out.println("3.返回");
        System.out.println("4.直接退出系统");
        System.out.println("---------------------------------------");
        System.out.println("uplooking.com\n\n");

    }
}
