package JPATest.ENTITY;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Kanfeer
 * @package_name JPATEST.ENTITY
 * @date 2020/12/3 - 8:12
 * @project_name NewProjectByIDEA
 */
@Entity
@Table(name = "person")
public class Person implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "personId")
    private int personId;
    @Column(name = "personName",nullable = false)
    private String personName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCard_id",unique = true)
    private IDCard idCard;

    public Person( String personName, IDCard idCard) {
        this.personName = personName;
        this.idCard = idCard;
    }

    public int getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }

    public Person() {
    }
}
