package org.practice.singletone;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
    private static String port = "3306";
    private static String dbName = "database_name";
    private static String hostIP = null;
    private static String userName = "username";
    private static String password = "password";
    private static String jdbc = null;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String instance = null;
    private static String URL = "jdbc:mysql://localhost:3306/";//URL=driver:instance://IP:port

    private Connection conn;

    private static MySqlConnection db;

    private MySqlConnection() {
        try{
            Class.forName(driver).newInstance();
            this.conn = (Connection) DriverManager.getConnection(URL+dbName,userName ,password);

        }catch (Exception sqlException) {
            sqlException.printStackTrace();
        }
    }
    /**
     * Main object creator
     * @return
     */
    public static synchronized MySqlConnection getDbConnection(){
        if(db==null){
            db = new MySqlConnection();
        }
        return db;
    }

    public Connection getConnection(){
        return conn;
    }




}
