package com.globant.db;

public class DBConnection {

    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";
    private static final String DB_CONNECTION_STRING = "jdbc:mysql:localhost:3306/shoppingcart&useSSL=false";
    private static DBConnection instance;

    private Connection connection;

    private DBConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }
  
    public Connection getConnection() throws SQLException {
        this.connection = DriverManager.getConnection(url,connectionProps);
        System.out.println("Connected to database");
        return conn;
    }

    public static DBconnection getInstance() {
        if (instance == null) {
            instance = new DBconnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DBconnection();
        }
       return instance;
    }
}
