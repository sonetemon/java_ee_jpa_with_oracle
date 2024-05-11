package com.dbh.basic;

import java.util.List;

public class UserService implements UserInterface {

    @Override
    public List<User> findAll() {
        return List.of(new User(1, "A"));
    }
}
