package org.owltech.creational.objectpull;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool extends ReusablePool<Connection> {
    private String url, userName, password;

    public ConnectionPool(String driver, String url, String userName, String password) {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.url = url;
        this.userName = userName;
        this.password = password;
    }

    @Override
    protected Connection createObject() {
        try {
            return DriverManager.getConnection(url, userName, password);
        } catch (SQLException sex) {
            sex.printStackTrace();
            return null;
        }
    }

    @Override
    public void expiredObject(Connection o) {
        try {
            o.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean validateObject(Connection o) {
        try {
            return !o.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
