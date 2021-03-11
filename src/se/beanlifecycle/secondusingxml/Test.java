package se.beanlifecycle.secondusingxml;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {
    private String driver, url, username, pwd;
    private Connection connection;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void conInit() throws Exception {
        Class.forName(driver);
        connection = DriverManager.getConnection(url, username, pwd);
        System.out.println("Connection opened here");

    }

    public void save(int id, String name, String email, String address) throws Exception {
        PreparedStatement ps = connection.prepareStatement("insert into student values(?,?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, email);
        ps.setString(4, address);
        ps.executeUpdate();
        System.out.println("Insertion success!");


    }


    public void conDestroy() throws Exception {
        connection.close();
    }
}
