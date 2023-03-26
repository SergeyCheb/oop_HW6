package homework;

import homework.report.Reportable;
import homework.report.impl.Report;
import homework.saver.ISaver;
import homework.saver.impl.Persister;
import homework.user.impl.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Reportable report = new Report();
        ISaver saver = new Persister();
        report.report(user);
        saver.save(user);
    }
}