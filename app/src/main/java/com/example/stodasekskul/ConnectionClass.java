package com.example.stodasekskul;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
    private static final String DEFAULT_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DEFAULT_URL = "jdbc:oracle:thin:@ec2-54-188-53-95.us-west-2.compute.amazonaws.com:1521:xe";
    private static final String DEFAULT_USERNAME = "hr";
    private static final String DEFAULT_PASSWORD = "mima";

    private Connection connection;

    @SuppressLint("NewApi")
    public Connection CONN(){
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        try {
            connection = createConnection();
        } catch (SQLException se) {
            Log.e("ERRO", se.getMessage());
        } catch (ClassNotFoundException e) {
            Log.e("ERRO", e.getMessage());
        } catch (Exception e) {
            Log.e("ERRO", e.getMessage());
        }

        return connection;
    }

    public static Connection createConnection(String driver, String url, String username, String password) throws ClassNotFoundException, java.sql.SQLException {
        Class.forName(driver);
        return DriverManager.getConnection(url, username, password);
    }

    public static Connection createConnection() throws ClassNotFoundException, java.sql.SQLException {
        return createConnection(DEFAULT_DRIVER, DEFAULT_URL, DEFAULT_USERNAME, DEFAULT_PASSWORD);
    }
}
