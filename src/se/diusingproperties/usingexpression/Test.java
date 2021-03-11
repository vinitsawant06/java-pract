package se.diusingproperties.usingexpression;





import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
    private String driver, url, username, pwd;


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
    public void creteConnection() {
        try{
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, pwd);
            System.out.println(connection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
