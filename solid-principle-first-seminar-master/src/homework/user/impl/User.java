package homework.user.impl;

import homework.user.AbstractUser;

public class User extends AbstractUser {
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
