package org.example;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");

        ReadDataSource readDataSource = new ReadDataSource();
        var data = readDataSource.get("6207");



        data.forEach(System.out::println);
    }
}
