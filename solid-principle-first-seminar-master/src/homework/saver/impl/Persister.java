package homework.saver.impl;

import homework.saver.ISaver;
import homework.user.AbstractUser;

public class Persister implements ISaver {
    @Override
    public void save(AbstractUser user) {
        System.out.println("Save user: " + user.getName());
    }
}
