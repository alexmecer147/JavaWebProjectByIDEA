package JPATest.ENTITY;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author Kanfeer
 * @package_name JPATest.ENTITY
 * @date 2020/12/3 - 8:46
 * @project_name NewProjectByIDEA
 */
@Entity
@Table(name = "departmente")
public class DepartmentE implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "departmente_emmployee_table",
            joinColumns = {
                @JoinColumn(name = "departmente_id",referencedColumnName = "id")
            },
            inverseJoinColumns = {@JoinColumn(name = "employee_id",referencedColumnName = "id")})
    private Collection<Employee> employees;

    public DepartmentE() {
    }

    public DepartmentE(int id, String name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
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
