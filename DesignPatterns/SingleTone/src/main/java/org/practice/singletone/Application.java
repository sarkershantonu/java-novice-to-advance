package org.practice.singletone;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {
    private Statement statement;
    private static MySqlConnection db;

    public Application() {
        db=MySqlConnection.getDbConnection();
    }

    public ResultSet query(String queryString) throws SQLException {
        statement = (Statement) db.getConnection().createStatement();
        ResultSet results = statement.executeQuery(queryString);
        return results;
    }
    public int insert(String insertQuerryString) throws SQLException{
        statement = (Statement) db.getConnection().createStatement();
        int results = statement.executeUpdate(insertQuerryString);
        return results;
    }
}
