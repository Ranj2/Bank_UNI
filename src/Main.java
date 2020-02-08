import java.sql.*;
import java.util.*;

public class Main {
    public String username;
    private String password;
    private static int money;


    public static void main(String[] args) throws SQLException {

        Login log = new Login();
        log.setVisible(true);

    }
    void set_pass(String pass) {
        password = pass;
    }
    String get_pass() {
        return password;
    }
    void set_money(int mon) {
        money = mon;
    }
    int get_money() {
        return money;
    }

}