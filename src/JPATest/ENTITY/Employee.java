package JPATest.ENTITY;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Kanfeer
 * @package_name JPATest.ENTITY
 * @date 2020/12/3 - 8:51
 * @project_name NewProjectByIDEA
 */
@Entity
public class Employee {
    @Id
    private int id;
    private String name;
}
