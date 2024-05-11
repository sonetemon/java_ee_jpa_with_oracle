package com.dbh.basic;

import java.util.List;

public class EmployeeService1 implements UserInterface{
    @Override
    public List<User> findAll() {
        return List.of(new User(2, "B"));
    }
}
