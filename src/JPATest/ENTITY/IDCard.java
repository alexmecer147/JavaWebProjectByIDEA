package JPATest.ENTITY;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Kanfeer
 * @package_name JPATest.ENTITY
 * @date 2020/12/3 - 8:24
 * @project_name NewProjectByIDEA
 */
@Entity
@Table(name = "idcard")
public class IDCard implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "cardName",nullable = false,length = 18,unique = true)
    private String cardNumber;
    @OneToOne(optional = false,cascade = CascadeType.REFRESH,mappedBy = "idCard")
    private Person person;
}
