package com.anhnbt.dao;

import com.anhnbt.model.Login;
import com.anhnbt.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static final List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("admin", "admin", "Administrator", "admin@gmail.com", 26));
        users.add(new User("anh", "anh", "Anh", "anh@gmail.com", 18));
        users.add(new User("rose", "rose", "Rose", "rose@gmail.com", 19));
    }

    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
