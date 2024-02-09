package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Steve", "Jobs", (byte) 56);
        service.saveUser("Mark", "Cukerberg", (byte) 39);
        service.saveUser("Jeff", "Besos", (byte) 60);
        service.saveUser("Vasya", "iz tretiego podiezda", (byte) 25);
        service.getAllUsers().forEach(System.out::println);

        service.cleanUsersTable();
        service.dropUsersTable();

    }
}


