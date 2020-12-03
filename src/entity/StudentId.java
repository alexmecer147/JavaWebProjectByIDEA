package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Kanfeer
 * @package_name entity
 * @date 2020/11/23 - 18:36
 * @project_name NewProjectByIDEA
 */
@Entity(name = "StudentId")
@Table(name = "studentidcard")
public class StudentId implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String idCardNumber;

    public StudentId() {
    }

    public StudentId(int id, String idCardNumber) {
        this.id = id;
        this.idCardNumber = idCardNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }
}
