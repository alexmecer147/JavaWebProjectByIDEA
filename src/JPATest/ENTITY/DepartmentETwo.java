package JPATest.ENTITY;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * @author Kanfeer
 * @package_name JPATest.ENTITY
 * @date 2020/12/3 - 9:38
 * @project_name NewProjectByIDEA
 */
@Entity
@Table(name = "departmentetwo")
public class DepartmentETwo implements Serializable {
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "departmentETwo",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Collection<EmployeeTwo> employeeTwos;

    public DepartmentETwo(int id, String name, Collection<EmployeeTwo> employeeTwos) {
        this.id = id;
        this.name = name;
        this.employeeTwos = employeeTwos;
    }

    public DepartmentETwo() {
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

    public Collection<EmployeeTwo> getEmployeeTwos() {
        return employeeTwos;
    }

    public void setEmployeeTwos(Collection<EmployeeTwo> employeeTwos) {
        this.employeeTwos = employeeTwos;
    }
}
