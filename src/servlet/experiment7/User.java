package servlet.experiment7;

import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Kanfeer
 * @package_name util
 * @date 2020/10/29 - 8:18
 * @project_name NewProjectByIDEA
 */
public class User {
    private int id;
    private String name;
    private String password;
    private String sex;
    private String birthday;
    private int money;
    private int age;

    public User() {
    }

    public User(int id, String name, String password, String sex, String birthday, int money, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.money = money;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int login(User user) throws SQLException {
        Connection conn;
        conn = DBConnection.getConnection();
        String sql = "select * from user where name = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,user.getName());
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            if (rs.getString("password").equals(user.getPassword())){
                System.out.println(rs.getString("password"));
                return 1;
            }
        }
        return -1;
    }

    public User getUserByName(String name) throws SQLException {
        Connection conn;
        conn = DBConnection.getConnection();
        String sql = "select * from user where name = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,name);
        ResultSet rs = pst.executeQuery();
        User p = new User();
        while (rs.next()){
            p.setId(rs.getInt("id"));
            p.setAge(rs.getInt("age"));
            p.setBirthday(rs.getString("birthday"));
            p.setMoney(rs.getInt("money"));
            p.setName(rs.getString("name"));
            p.setPassword(rs.getString("password"));
            p.setSex(rs.getString("sex"));
        }
        return p;
    }
}
