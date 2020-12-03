package JPATest.ENTITY;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Kanfeer
 * @package_name JPATEST.ENTITY
 * @date 2020/11/26 - 8:08
 * @project_name NewProjectByIDEA
 */
@Entity
public class ClassInfo implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int classId;
    @Column(name = "name")
    private String className;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "departmentId")
    private Department department;
    public ClassInfo() {
    }

    public ClassInfo(int classId, String className, Department department) {
        this.classId = classId;
        this.className = className;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ClassInfo(int classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
