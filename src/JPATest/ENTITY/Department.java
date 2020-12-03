package JPATest.ENTITY;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author Kanfeer
 * @package_name JPATEST.ENTITY
 * @date 2020/11/26 - 8:03
 * @project_name NewProjectByIDEA
 */
@Entity(name = "department")
public class Department {
    @Id
    @GeneratedValue
    private int id;
    private String name;
//    @Column(name = "id",insertable = true,nullable = false,updatable = true)
//    private int classInfoId;
    @OneToMany(mappedBy = "department",fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
    private Collection<ClassInfo> classInfos;

    public Department(int id, String name, Collection<ClassInfo> classInfos) {
        this.id = id;
        this.name = name;
        this.classInfos = classInfos;
    }

    public Department() {
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


    public Collection<ClassInfo> getClassInfos() {
        return classInfos;
    }

    public void setClassInfos(Collection<ClassInfo> classInfos) {
        this.classInfos = classInfos;
    }
}
