package JPATest.ENTITY;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Kanfeer
 * @package_name JPATest.ENTITY
 * @date 2020/12/3 - 9:39
 * @project_name NewProjectByIDEA
 */
@Entity
@Table(name = "employeetwo")
public class EmployeeTwo implements Serializable {
    @Id
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentETwo departmentETwo;

    public EmployeeTwo() {
    }

    public EmployeeTwo(int id, String name, DepartmentETwo departmentETwo) {
        this.id = id;
        this.name = name;
        this.departmentETwo = departmentETwo;
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

    public DepartmentETwo getDepartmentETwo() {
        return departmentETwo;
    }

    public void setDepartmentETwo(DepartmentETwo departmentETwo) {
        this.departmentETwo = departmentETwo;
    }
}
