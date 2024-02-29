package org.example;
import java.sql.*;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadDataSource {
    public  List<Rule> get(String query) {
        String url = "jdbc:postgresql://localhost:6543/jbpmdb";
        String user = "postgres";
        String password = "123";

        ResultSet resultSet = null;
        List<Rule> ruleCases= new ArrayList<>();
        List<Rule> ruleCases2= new ArrayList<>();


        try {
            // Veritabanına bağlan
            Connection connection = DriverManager.getConnection(url, user, password);

            // SQL sorgusunu hazırla

            String sql = "SELECT * FROM table_name WHERE deger LIKE ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,  query +"%");
            resultSet = statement.executeQuery();

            ResultSet finalResultSet = resultSet;
            Stream<Rule> ruleStream = Stream.generate(() -> {
                try {
                    if (finalResultSet.next()) {
                        Rule rule = new Rule();
                        rule.setRuleUid(finalResultSet.getString("RULEUID"));
                        rule.setCaseUid(finalResultSet.getString("CASEUID"));
                        return rule;
                    } else {
                        return null;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            }).takeWhile(Objects::nonNull);

            ruleStream.forEach(ruleCases2::add);


            // Bağlantıyı kapat
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ruleCases2;
    }
}


