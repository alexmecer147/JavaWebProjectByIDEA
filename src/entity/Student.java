package entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Kanfeer
 * @package_name entity
 * @date 2020/11/21 - 11:28
 * @project_name NewProjectByIDEA
 */

@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToOne(optional = true,cascade = CascadeType.ALL)
    @JoinColumn(name = "studentidcard_id")
    private StudentId sid;

    public Student(int id, String name, StudentId sid) {
        this.id = id;
        this.name = name;
        this.sid = sid;
    }

    public StudentId getSid() {
        return sid;
    }

    public void setSid(StudentId sid) {
        this.sid = sid;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
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
}
