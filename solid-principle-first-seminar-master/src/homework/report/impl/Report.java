package homework.report.impl;

import homework.report.Reportable;
import homework.user.AbstractUser;

public class Report implements Reportable {
    @Override
    public void report(AbstractUser user) {
        System.out.println("Report for user: " + user.getName());
    }
}
