package com.dbh.basic;

public class Client {

    public static void main(String[] args) {
        UserInterface user = new UserService();
        System.out.println(user.findAll());

        UserInterface employee = new EmployeeService1();
        System.out.println(employee.findAll());
    }
}
