package ch05;

import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex Mecer
 * @date 2020/10/8 - 8:40
 */
public class User {
    private int id;
    private String name;
    private String password;
    private String sex;
    private int age;
    private String birthday;

    public User(){

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean login() throws SQLException {
        boolean res = false;
        Connection conn =  DBConnection.getConnection();
        String sql = "select id from user where name = ? and password = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,this.name);
        pst.setString(1,this.password);
        ResultSet rs = pst.executeQuery();
        if (rs.next()){
            res = true;
        }
        return res;
    }

    public int register() throws SQLException {
        int id = -1;
        Connection conn = null;
        conn = DBConnection.getConnection();
        String sql = "insert into user (name,password,sex,age,birthday) value (?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pst.setString(1,name);
        pst.setString(2,password);
        pst.setString(3,sex);
        pst.setInt(4,age);
        pst.setString(5,birthday);
        pst.executeQuery();
        ResultSet rs = pst.getGeneratedKeys();
        if (rs.next()){
            id = rs.getInt(1);
        }
        return id;
    }

    public int delete() throws SQLException {
        int num = 0;
        String sql = "delete from user where name = ?";
        Connection conn = DBConnection.getConnection();
        PreparedStatement pst = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        pst.setString(1,"张三");
        pst.executeUpdate();
        ResultSet rs = pst.getGeneratedKeys();
        if (rs.next()){
            num = rs.getInt(1);
        }
        return num;
    }

    public int update() throws SQLException {
        int upid= 0;
        Connection conn = DBConnection.getConnection();
        String sql = "update user set age = ? where name = ?";
        PreparedStatement pst = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1,200);
        pst.setString(2,"张三");
        pst.executeUpdate();
        ResultSet rs = pst.getGeneratedKeys();
        if (rs.next()){
            upid = rs.getInt(1);
        }
        return upid;
    }

    public User getUserById(int id) throws SQLException {
        User user = null;
        Connection conn = DBConnection.getConnection();
        String sql = "select * from user where id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()){
            user = new User();
            user.setId(id);
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setAge(rs.getInt("age"));
            user.setBirthday(rs.getString("birthday"));
            user.setSex(rs.getString("sex"));
        }
        return user;
    }

    public List<User> getAllUser() throws SQLException {
        List<User> users = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        String sql = "select * from user";
        PreparedStatement pst = conn.prepareStatement(sql);
        //pst.setInt(1,id );
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setAge(rs.getInt("age"));
            user.setBirthday(rs.getString("birthday"));
            user.setSex(rs.getString("sex"));
            users.add(user);
        }
        return users;
    }
}
